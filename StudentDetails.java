class Student {
    private int rollNo;
    private String name;

    Student() {
        rollNo = 0;
        name = "New Student";
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
        name = "New Student";
    }

    Student(String name) {
        rollNo = 0;
        this.name = name;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    protected void display() {
        System.out.println("\nRoll Number : " + rollNo + "\nStudent Name : " + name);
    }

    int getRollNo() {
        return this.rollNo;
    }

    String getName() {
        return this.name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setName(String name) {
        this.name = name;
    }
}

public class StudentDetails {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(20);
        Student s3 = new Student("Jhansi");
        Student s4 = new Student(10, "Deepika");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        System.out.println(s2.getRollNo());
        System.out.println(s3.getName());
        s2.setName("Naga");
        s3.setRollNo(15);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
