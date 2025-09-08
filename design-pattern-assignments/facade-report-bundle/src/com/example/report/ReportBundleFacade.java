package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;
    
    public ReportBundleFacade() {
        this.jsonWriter = new JsonWriter();
        this.zipper = new Zipper();
        this.auditLog = new AuditLog();
    }
    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Path jsonFile = jsonWriter.write(data, outDir, baseName);
        
        Path zipPath = outDir.resolve(baseName + ".zip");
        Path resultZip = zipper.zip(jsonFile, zipPath);

        auditLog.log("exported " + resultZip);
        
        return resultZip;
    }
}
