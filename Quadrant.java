import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x,y;
        System.out.println("enter x, y values : ");
        x = S.nextInt();
        y = S.nextInt();
        if(x>0){
            if(y>0)
                System.out.println("("+x+","+y+") belongs to Quadrant 1");
            else
                System.out.println("("+x+","+y+") belongs to Quadrant 4");
        }
        else{
            if(y>0)
                System.out.println("("+x+","+y+") belongs to Quadrant 2");
            else
                System.out.println("("+x+","+y+") belongs to Quadrant 3");
        } 
    }
}
