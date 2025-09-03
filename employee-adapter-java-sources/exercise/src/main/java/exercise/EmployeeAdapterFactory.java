package exercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapterFactory {
    
    public static List<Employee> createEmployees(List<EmployeeCSV> csvEmployees, List<EmployeeDB> dbEmployees, List<EmployeeLDAP> ldapEmployees) {
        List<Employee> employees = new ArrayList<>();
        
        for (EmployeeCSV csv : csvEmployees) {
            employees.add(new EmployeeCSVAdapter(csv));
        }
        
        for (EmployeeDB db : dbEmployees) {
            employees.add(new EmployeeDBAdapter(db));
        }
        
        for (EmployeeLDAP ldap : ldapEmployees) {
            employees.add(new EmployeeLDAPAdapter(ldap));
        }
        
        return employees;
    }
}
