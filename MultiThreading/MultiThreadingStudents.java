package MultiThreading;

import java.util.ArrayList;

class Height{
    int feet;
    int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "feet=" + feet + ", inches=" + inches;
    }    
}

abstract class Student{
    String name;
    Height height;
    String branch;

    public Student(String name, Height height) {
        this.name = name;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public static int compareByHeight (Student s1, Student s2){
        if(s1.height.feet>s2.height.feet) return 1;
        else if(s1.height.feet==s2.height.feet){
            if(s2.height.inches==s1.height.inches) return 0;
            else if(s2.height.inches>s1.height.inches) return 1;
            else return -1;
        }    
        return -1;
    }

    @Override
    public String toString() {
        return "Student [Branch=" + branch + ", Height=" + height + ", Name=" + name + "]";
    }
}

class EEEStudent extends Student{

    public EEEStudent(String name, Height height) {
        super(name, height);
        this.branch = "EEE";
    }
}

class ECEStudent extends Student{

    public ECEStudent(String name, Height height) {
        super(name, height);
        this.branch = "ECE";
    }
}

class CSEStudent extends Student{

    public CSEStudent(String name, Height height) {
        super(name, height);
        this.branch = "CSE";
    }
}

class StudentAdministration{
    Student[] students;
    boolean flag= false;
    int cnt=0;

    public StudentAdministration(Student[] students) {
        this.students = students;
    }

    public void sortByHeight(){
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students.length;j++){
                if((Student.compareByHeight(students[i],students[j]))==-1){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void displaySortedEEEStudents() throws InterruptedException{
        ArrayList<Student> eee = new ArrayList<Student>();
        for(int i=0;i<students.length;i++){
            if(students[i].getBranch().equals("EEE"))
                eee.add(students[i]);
        }
        Student[] eeeStudents = eee.toArray(new EEEStudent[eee.size()]);
        synchronized(this){
            int i=0;
            while(i<eeeStudents.length){
                while(flag){
                    notifyAll();
                }
                flag=true;
                System.out.println(eeeStudents[i++]);
                cnt++;
                flag =false;
                if(cnt<students.length-1)
                wait();
            }
        }
    } 

    public void displaySortedECEStudents() throws InterruptedException{
        ArrayList<Student> ece = new ArrayList<Student>();

        int j=0;
        for(int i=0;i<students.length;i++){
            if(students[i].getBranch().equals("ECE"))
                ece.add(students[i]);
        }
        Student[] eceStudents = ece.toArray(new ECEStudent[ece.size()]);

        synchronized (this){
            int i=0;
            while(i<eceStudents.length){
                while(flag){
                    notifyAll();
                }
                flag=true;
                System.out.println(eceStudents[i++]);
                cnt++;
                flag =false;
                if(cnt<students.length-1)
                wait();
            }
        }
    }

    public void displaySortedCSEStudents() throws InterruptedException{
        ArrayList<Student> cse = new ArrayList<Student>();
        for(int i=0;i<students.length;i++){
            if(students[i].getBranch().equals("CSE"))
                cse.add(students[i]);
        }
        Student[] cseStudents = cse.toArray(new CSEStudent[cse.size()]);

        synchronized (this){
            int i=0;
            while(i<cseStudents.length){
                while(flag){
                    if(cnt<students.length-1)
                    wait();
                }
                flag=true;
                System.out.println(cseStudents[i++]);
                cnt++;
                notifyAll();
                flag =false;
            }
        }
    }
}

public class MultiThreadingStudents {
    public static void main(String[] args) {
        EEEStudent s1 = new EEEStudent("Deepika",new Height(5,5));
        EEEStudent s2 = new EEEStudent("Jhansi",new Height(5,3));
        ECEStudent s3 = new ECEStudent("SiriSri",new Height(5,8));
        ECEStudent s4 = new ECEStudent("Varshini",new Height(5,9));
        CSEStudent s5 = new CSEStudent("Tejaswi",new Height(5,1));
        CSEStudent s6 = new CSEStudent("Hema",new Height(5,6));
        
        Student[] students = new Student[] {s1,s2,s3,s4,s5,s6};
        
        StudentAdministration studentAdministration = new StudentAdministration(students);
        studentAdministration.sortByHeight();        
        new Thread() {
            public void run() {
                try {
                    studentAdministration.displaySortedEEEStudents();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    studentAdministration.displaySortedECEStudents();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    studentAdministration.displaySortedCSEStudents();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }.start(); 
    } 
}
