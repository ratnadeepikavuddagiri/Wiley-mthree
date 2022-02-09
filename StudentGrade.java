import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int m, p, c;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter marks in maths : ");
        m = S.nextInt();
        System.out.println("Enter marks in physics : ");
        p = S.nextInt();
        System.out.println("Enter marks in chemistry : ");
        c = S.nextInt();
        int total = m + p + c;
        char grade;
        int percentage = (total * 100) / 300;
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("Grade = " + grade);

    }
}
