import java.util.*;
public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1,str2;
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        if(str1.length() != str2.length()) 
            System.out.println("Not Anagrams.");

        else{
            if(checkAnagrams(sortString(str1).toLowerCase(),sortString(str2).toLowerCase()))
                System.out.println("Anagrams");
            else
            System.out.println("Not Anagrams.");
        }       
        scanner.close(); 
    }

    static String sortString(String str){
        str=str.replace(" ","");
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    static boolean checkAnagrams(String str1,String str2){
        int n = str1.length();
        for(int i=0;i<n;i++){
            if(str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }
}
