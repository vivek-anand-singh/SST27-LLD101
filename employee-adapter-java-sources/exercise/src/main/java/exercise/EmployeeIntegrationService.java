package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeIntegrationService {
    public List<Employee> integrateEmployeeData(
            Collection<EmployeeCSV> csvEmployees,
            Collection<EmployeeDB> dbEmployees,
            Collection<EmployeeLDAP> ldapEmployees) {
        
        List<Employee> integratedEmployees = new ArrayList<>();
        
        if (csvEmployees != null) {
            integratedEmployees.addAll(EmployeeAdapterFactory.createFromCSVCollection(csvEmployees));
        }
        
        if (dbEmployees != null) {
            integratedEmployees.addAll(EmployeeAdapterFactory.createFromDBCollection(dbEmployees));
        }
        
        if (ldapEmployees != null) {
            integratedEmployees.addAll(EmployeeAdapterFactory.createFromLDAPCollection(ldapEmployees));
        }
        
        return integratedEmployees;
    }

    public void displayEmployees(Collection<Employee> employees) {
        if (employees != null && !employees.isEmpty()) {
            EmployeePrinter.print(employees);
        } else {
            System.out.println("No employee data to display.");
        }
    }
}
