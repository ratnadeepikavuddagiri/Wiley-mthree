import java.util.Scanner;
public class LowerUpperDigits {
    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String s = S.nextLine();
        int l=0,u=0,d=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                d++;
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                l++;
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                u++;
        }
        System.out.println("Lower case : "+l+"\n"+"Upper Case : "+u+"\n"+"Digits : "+d);
    }
}
