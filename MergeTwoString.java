import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(mergeStrings(ch1,ch2));
    }

    static String mergeStrings(char[] str1, char[] str2) {
        int n1=str1.length;
        int n2=str2.length;
        char[] str = new char[n1+n2];
        

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(str1[i]==str2[j])
                str[k++]=str1[i++];
            else if(str1[i]<str2[j])
                str[k++]=str1[i++];
            else
                str[k++]=str2[j++];
        }
        if(i<n1){
            while(i<n1){
                str[k++] = str1[i++];
            }
        }
        if(j<n2){
            while(j<n2){
                str[k++] = str2[j++];
            }
        }
        return new String(str);
    }
}
