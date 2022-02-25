package p1;
import java.util.Arrays;
import java.util.Scanner;
class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(String countryCode, String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }    
}

class IndianPhoneNumber extends PhoneNumber {
    IndianPhoneNumber(String phNo) {
        super("+91", phNo);
    }
}

class User{
    String email;
    String password;
    String firstName;
    String lastName;
    PhoneNumber[] phoneNumber;

    public User(String email, String password, String firstName, String lastName,PhoneNumber[] phoneNumber) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
                + ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
    }
}

class InvalidUserInput extends Exception {

    InvalidUserInput(String msg) {
        super(msg);
    }
    
}

class Validation {
    public static void validate(User user) throws InvalidUserInput{
        if(checkAlphabets(user.firstName))
            throw new InvalidUserInput("First Name Should only contain alphabets");
        if(checkAlphabets(user.lastName))
            throw new InvalidUserInput("Last Name Should only contain alphabets");
        if(!(checkPassword(user.password)))
            throw new InvalidUserInput("Password Should contain 8-16 characters and atleast 1 digit");
        if(!(checkEmail(user.email)))
            throw new InvalidUserInput("Email Should contain @ and . in it");
        if(checkPhoneNumber(user.phoneNumber))
            throw new InvalidUserInput("Phone Number Should contain 10 digits.");
    }
        
    static boolean checkPhoneNumber(PhoneNumber[] phno){
        for(int i=0;i<phno.length;i++){
            String str = phno[i].phNo;
            if(str.length()<10)
                return false;
            if(!(str.charAt(i)>='0'&&str.charAt(i)<='9'))
            return false;
        }
        return true;
    }

    static boolean checkEmail(String email) {
        int dot=0,sym=0,n=email.length();
        for(int i=0;i<n;i++){
            if(email.charAt(i)=='@')
            sym=1;
            else if(email.charAt(i)=='.')
            dot=1;
            else if(email.charAt(i)==' ')
            return false;
        }
        return (sym==1 && dot==1);
    }

    static boolean checkPassword(String pswd) {
        int n = pswd.length();
        if((n<8)||(n>16))
        return false;
        else{
            int c=0;
            for(int i=0;i<n;i++){
                if(pswd.charAt(i)>='0' && pswd.charAt(i)<='9')
                    c=1;
            }
            if(c==1)
            return true;
        }
        return false;
    }

     static boolean checkAlphabets(String str) {
        int n = str.toLowerCase().length();
        for(int i=0;i<n;i++){
            if(!(str.charAt(i)>='a' && str.charAt(i)<='z'))
                return false;
        }
        return true;
    }
}

public class UserDetails {
    public static void main(String[] args) {
        String firstName,lastName,password,email,phno,code;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Details");
        System.out.println("Enter User First Name:");
        firstName = scanner.next();
        System.out.println("Enter User Last Name:");
        lastName = scanner.next();
        System.out.println("Enter User Email:");
        email = scanner.next();
        System.out.println("Enter User Password:");
        password = scanner.next();
        int num;
        System.out.println("Enter no. of Phone Numbers:");
        num = scanner.nextInt();
        PhoneNumber[] phoneNumbers = new PhoneNumber[num];
        for(int i=1;i<=num;i++){
            System.out.println("Phone Number"+i+" :");
            System.out.println("Enter Country code :");
            code = scanner.next();
            System.out.println("Enter Phone Number :");
            phno = scanner.next();
            phoneNumbers[i] = new PhoneNumber(code,phno);
        }
        
        User user = new User(email,password,firstName,lastName,phoneNumbers);
        System.out.println("Enter n :");
        int n = scanner.nextInt();
        IndianPhoneNumber[] indianPhoneNumbers = new IndianPhoneNumber[n];
        System.out.println("Enter the numbers :");
        for(int i=0;i<n;i++){
            String phnum=scanner.next();
            indianPhoneNumbers[i] = new IndianPhoneNumber(phnum);
        }
        
        try{
            Validation.validate(user);
        }
        catch(InvalidUserInput e){
            System.out.println(e.getMessage());
        }
        
        String fullName = user.firstName+user.lastName;
        System.out.println(fullName);
        for(int i=0;i<n;i++)
        System.out.println(indianPhoneNumbers[i]);
        
    }    
}
