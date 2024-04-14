public class Employee{
    private String empNo, lastName, firstName;
    private  Double salary;
    public void setEmpNo(String empNo){
        this.empNo= empNo;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getEmpNo(){
        return empNo;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}