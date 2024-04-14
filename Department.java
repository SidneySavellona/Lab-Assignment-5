import java.util.HashMap;

public class Department {
    private String deptCode;
    private String deptName;
    private Double depTotalSalary;
    private HashMap<String, Employee> employeeMap;

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public void setDepTotalSalary(Double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }
    public String getDeptCode() {
        return deptCode;
    }
    public String getDeptName() {
        return deptName;
    }
    public Double getDepTotalSalary(){
        return depTotalSalary;
    }
    public void setEmployeeMap(HashMap<String,Employee> employeeMap) {
    this.employeeMap = employeeMap;
    }
    public HashMap<String, Employee> getEmployeeMap() {
        return employeeMap;

}}