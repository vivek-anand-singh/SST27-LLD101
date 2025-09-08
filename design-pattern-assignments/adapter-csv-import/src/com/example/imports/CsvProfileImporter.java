package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = Objects.requireNonNull(csvReader, "csvReader");
        this.profileService = Objects.requireNonNull(profileService, "profileService");
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = csvReader.read(csvFile);
        int successfulImports = 0;
        
        for (int i = 0; i < rows.size(); i++) {
            String[] row = rows.get(i);
            
            try {
                // Validate row has correct number of columns
                if (row.length < 3) {
                    System.out.println("Skipping row " + (i + 1) + ": insufficient columns");
                    continue;
                }
                
                String id = row[0].trim();
                String email = row[1].trim();
                String displayName = row[2].trim();
                
                // Validate required fields
                if (id.isEmpty()) {
                    System.out.println("Skipping row " + (i + 1) + ": missing id");
                    continue;
                }
                
                if (email.isEmpty()) {
                    System.out.println("Skipping row " + (i + 1) + ": missing email");
                    continue;
                }
                
                // Let ProfileService handle email validation and profile creation
                profileService.createProfile(id, email, displayName);
                successfulImports++;
                
            } catch (IllegalArgumentException e) {
                System.out.println("Skipping row " + (i + 1) + ": " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Skipping row " + (i + 1) + ": unexpected error - " + e.getMessage());
            }
        }
        
        return successfulImports;
    }
}
