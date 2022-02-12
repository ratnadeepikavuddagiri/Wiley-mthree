class Student1 {
    static int count = 1;
    private int rollNo;
    private String name;
    static final String CLGNAME = "SVECW";
    private String city;

    Student1() {
        this.rollNo = count++;
        this.name = "New Student";
        this.city = "Not Mentioned";
    }

    Student1(String name) {
        this();
        this.name = name;
    }

    Student1(String name, String city) {
        this(name);
        this.name = name;
        this.city = city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public static String getClgname() {
        return CLGNAME;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    protected void display() {
        System.out.println("\nRoll Number : " + rollNo + "\nStudent Name : " + name + "\nCollege : " + CLGNAME
                + "\nCity :" + city);
    }

}

public class AutomaticRollNoGeneration {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Deepika");
        Student1 s3 = new Student1("Jhansi", "KKD");
        s1.display();
        s2.display();
        s3.display();
    }
}
