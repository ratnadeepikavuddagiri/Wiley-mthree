class GeneralPerson{
    String name;
    GeneralPerson(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "name=" + name + ", ";
    }

}
class Employee extends GeneralPerson {
    double salary;
    int year;
    String uan;
    public Employee(String name) {
        super(name);
    }
    public Employee(String name, int year) {
        super(name);
        this.year = year;
    }
    Employee(String name,double salary,int year,String uan){
        super(name);
        this.salary = salary;
        this.year = year;
        this.uan = uan;
    }
    
    
    double getSalary(){
        return this.salary;
    }
    int getYear(){
        return this.year;
    }
    String getUan(){
        return this.uan;
    }
    static boolean checkEmployees(Employee e1,Employee e2){
            return ((e1.getName().equals(e2.getName()))&&(e1.getSalary() == e2.getSalary())&&(e1.getYear() == e2.getYear())&&(e1.getUan().equals(e2.getUan())));
              
            
    }
    @Override
    public String toString() {
        
        return super.toString()+"salary=" + salary + ", uan=" + uan + ", year=" + year ;
    }   

}

public class EmployeeDetails {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Deepika",10000,2022,"1234");
        Employee e2 = new Employee("Deepika",10000,2022,"1234");
        GeneralPerson p1 = new GeneralPerson("Deepika");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(Employee.checkEmployees(e1,e2));
        if((p1.getClass())!=(e1.getClass()))
            System.out.println("Person object and e1 are not equal");
        else if(p1.equals(e1))
            System.out.println("Person object and e1 are equal");
        else
            System.out.println("Person object and e1 are equal");
        if(p1.getClass()!=e2.getClass())
            System.out.println("Person object and e2 are not equal");
        else if(p1.equals(e2))
            System.out.println("Person object and e2 are equal");
        else
            System.out.println("Person object and e2 are equal");
    }
}
