package JavaCollections;

import java.util.ArrayList;

class Employee {
    protected long   employeeId;
    protected String firstName;
    protected String lastName;

    public Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    boolean isEqual(Employee employee){
        if(employee == null)
        return false;
        if(this==employee)
        return true;
        if(!(employee instanceof Employee))
        return false;
        return (this.employeeId == employee.employeeId)&&(this.firstName.equals(employee.firstName))&&(this.lastName.equals(employee.lastName));      
    }

    public int compareTo(Employee employee) {
        if(this.employeeId > employee.employeeId)
            return 1;
        else if(this.employeeId < employee.employeeId)
            return -1;
        return 0;
    }

    void sortEmployees(Employee[] employees){
        for(int i=0;i<employees.length;i++){
            for(int j=0;j<employees.length-i-1;j++){
                if(employees[j].compareTo(employees[j+1])==1){
                    Employee emp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = emp;
                }
            }
        }
    }
}

public class Driver {
 public static void main(String[] args) {
     Employee e1 = new Employee(1,"Deepika","vuddagiri");
     Employee e2 = new Employee(2,"Jhansi","Pothuri");
     Employee e3 = new Employee(3,"Nandini","Karri");
     Employee[] employeeArray = {e2,e3,e1};
    //  ArrayList<Employee> employees = new ArrayList<>();
    //  employees.add(e1);
    //  employees.add(e2);
    //  employees.add(e3);
    //  employees.forEach(System.out::println);
    //  System.out.println(e1.isEqual(e2));
    //  System.out.println(e1.compareTo(e3));
    //  System.out.println(e3.compareTo(e1));     

    e1.sortEmployees(employeeArray);
    for(int i=0;i<employeeArray.length;i++)
        System.out.println(employeeArray[i]);

 }   
}
