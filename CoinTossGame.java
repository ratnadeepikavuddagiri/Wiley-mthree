import java.util.Random;
import java.util.Scanner;
class Coin{
    String sideUp;

    public Coin() {
        //toss();
    }
    
    void toss(){
        Random random = new Random();
        int rand =random.nextInt(3);
        if(rand == 0)
            this.sideUp = "Heads";
        else
            this.sideUp = "Tails";
    }

    String getSideUp(){
        return this.sideUp;
    }
}
public class CoinTossGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();
        double balance=0.0;

        while(balance<1){
            // int choice;
            // System.out.println("Choose the coin : \n1.Quarter\n2.Dime\n3.Nickel");
            // choice = scanner.nextInt();
            // if(choice ==1)
            quarter.toss();
            //else if(choice ==2)
            dime.toss();
            //else if(choice ==3)
            nickel.toss();
            //else
            //System.out.println("Invalid Choice!!");
            if((quarter.getSideUp()).equals("Heads"))
                balance += 0.25;
            else if((dime.getSideUp()).equals("Heads"))
                balance += 0.1;
            else if((nickel.getSideUp()).equals("Heads"))
                balance += 0.05;     
        }
        if(balance == 1)
            System.out.println("You won!");
        else
            System.out.println("You Lost!"+balance);       
    }
    
}
