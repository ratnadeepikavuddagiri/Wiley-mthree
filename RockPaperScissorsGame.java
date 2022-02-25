import java.util.*;


public class RockPaperScissorsGame {
    public static void main(String[] args) {
        final int ROCK =1,PAPER=2,SCISSOR=3;
        char ch;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Player 1: User\nPlayer 2: Computer\n");
            System.out.println("Choose your option\n1.Rock\n2.Scissors\n3.Paper\n");
            int user = scan.nextInt();
            int computer = (int) (Math.random() * 3);
            if (user == computer) 
                System.out.print("It is a tie!\n");
            else {
                switch (user) {
                    case ROCK:
                        if (computer == SCISSOR) {
                            System.out.println("Computer: SCISSOR\nUser: ROCK");
                            System.out.println("User wins!");
                        } 
                        else {
                            System.out.println("Computer: PAPER\nUser: ROCK");
                            System.out.println("Computer wins!");
                        }
                        break;
                    case SCISSOR:
                        if (computer == PAPER) {
                            System.out.println("Computer: PAPER\nUser: SCISSOR");
                            System.out.println("User wins!");
                        } 
                        else {
                            System.out.println("Computer: ROCK\nUser: SCISSOR");
                            System.out.println("Computer wins!");
                        }
                        break;
                    case PAPER:
                        if (computer == ROCK) {
                            System.out.println("Computer: ROCK\nUser: PAPER");
                            System.out.println("User wins!");
                        } 
                        else {
                            System.out.println("Computer: SCISSOR\nUser: PAPER");
                            System.out.println("Computer wins!");
                        }
                        break;
                }
        }
        System.out.println("play again?\nChoose(Y/N):");
        ch = scan.next().charAt(0);
    }while(ch=='Y');
    
}
}

 
    