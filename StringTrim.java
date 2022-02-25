import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String res="";
        int n = str.length();
        int i=0;
        while(str.codePointAt(i)==32){
            i++;
        }
        int j = str.length()-1;
        while(str.codePointAt(j)==32){
            j--;
        }
        for(int k=i;k<=j;k++){
            res +=str.charAt(k);
        }
        System.out.println(res);
    }
}
