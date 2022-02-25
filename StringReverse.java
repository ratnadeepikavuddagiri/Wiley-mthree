import java.util.Scanner;
public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(reverseString(str));
    }
    
    static String reverseString(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            if (ch[i] == ' ')
                i++;
            if (ch[j] == ' ')
                j--;
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
