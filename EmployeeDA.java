import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDA {
    private HashMap<String, Employee> employeeMap;

    public EmployeeDA(String empNo) {
        this.employeeMap = new HashMap<>();

        try {
            Scanner employeeFile = new Scanner(new FileReader("emp.csv"));

            while (employeeFile.hasNext()) {
                String employeeLineData = employeeFile.nextLine();
                String[] employeeLineDataSpecific = new String[3];
                employeeLineDataSpecific= employeeLineData.split(",");

                if (empNo.equals(employeeLineDataSpecific[0].trim())) {
                    Employee employee = new Employee();
                    employee.setEmpNo(employeeLineDataSpecific[0].trim());
                    employee.setLastName(employeeLineDataSpecific[1].trim());
                    employee.setFirstName(employeeLineDataSpecific[2].trim());
                    employeeMap.put(empNo,employee);
                    break;
                }
            }
            employeeFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, Employee> getEmployeeMap() {
        return employeeMap;
    }
}