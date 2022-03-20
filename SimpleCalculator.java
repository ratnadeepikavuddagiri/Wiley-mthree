
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        double val1, val2;
        char op;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the operands : ");
        System.out.println("operand 1 : ");
        val1 = S.nextDouble();
        System.out.println("operand 2 : ");
        val2 = S.nextDouble();
        System.out.println("Enter the operator:\nAddition(+)\nSubtraction(-)\nMultiplication(*)\nDivision(/)\nModulus(%):");
        op = S.next().charAt(0);
        switch (op) {
        case '+': System.out.println("Addition of " + val1 + " and " + val2 + " : " + (val1 + val2));
        break;
        case '-': System.out.println("Subtraction of " + val1 + " and " + val2 + " : " + (val1 - val2));
        break;
        case '*': System.out.println("Multiplication of " + val1 + " and " + val2 + " : " + (val1 * val2));
        break;
        case '/': if(val2!=0)
                    System.out.println("Division of " + val1 + " and " + val2 + " : " + (val1 / val2));
                  else
                    System.out.println("Division by zero is not possible!");
        break;
        case '%': System.out.println("Remainder when " + val2 + " divided by " + val1 + " : " + (val1 % val2));
        break;
        default: System.out.println("Enter the correct operand");
        }
    }
}
