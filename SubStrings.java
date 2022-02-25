import java.util.Scanner;
public class SubStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String substr;
        int flag=1;
        do{
            substr =scanner.next();
            if(substr.matches("\\d+"))
                break;
            if(isSubstring(str,substr)&&(flag != 0))
                flag = 1;
            else{
                flag=0;
                break;
            }
        }while(true);
        if(flag==1)
            System.out.println("True");
        else
            System.out.println("False");
    }

    static boolean isSubstring(String str, String substr) {
        int n1=str.length();
        int n2 =substr.length();
        int i=0,j=0,c=0;
        while(i<n1){
            while(j<n2){
                if(str.charAt(i)!=substr.charAt(j))
                i++;
                else{
                    i++;
                    j++;
                    c++;
                }
            }
        }
        return c==n2;
    }
}
