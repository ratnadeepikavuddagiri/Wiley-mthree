package JavaCollections;

import java.util.*;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
    private String name;
    private int id;
    private String subject;

    double percentage;
    
    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    @Override
    public int compareTo(Student o) {
    
        return (int) (o.percentage - this.percentage);
    }


}
public class StudentStatistics {
    public static void main(String[] args) {
        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println("Students with percentage>60 :");
        studentList.stream().filter(p1->p1.getPercentage()>60).forEach(System.out::println);
        System.out.println("\nTop 3 students:");
        List<Student> sortedList = studentList.stream().sorted().collect(Collectors.toList());
        for(int i=0;i<3;i++) 
            System.out.println(sortedList.get(i));
        System.out.println("\nStudents and Percentages:");
        studentList.stream().map(p1->p1.getName()+" "+p1.getPercentage()).forEach(System.out::println);
        System.out.println("\nSubjects:");
        studentList.stream().map(p1->p1.getSubject()).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("\nHighest Percentage : "+sortedList.get(0).getPercentage());
        System.out.println("Lowest Percentage : "+sortedList.get(sortedList.size()-1).getPercentage());
        double sum =studentList.stream().map(p1->p1.getPercentage()).reduce(0.0,(res,p1)->res+p1);
        System.out.println("Average Percentage : "+sum/studentList.size());
        System.out.println("\nTotal No.Of Students : "+studentList.size());
        System.out.println();
        studentList.stream().collect(Collectors.groupingBy(Student::getSubject)).forEach((sub, list) -> System.out.println(sub + " = " + list));   
    }
}
