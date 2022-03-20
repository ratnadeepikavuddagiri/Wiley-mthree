package MultiThreading;
class EvenOddNumbers{
    static int limit=50;
    int c=1;
    synchronized void printEven(){
        synchronized (this) {
            while (c<limit) {
                while(c%2 == 0){
                    try {
                        wait();
                    } catch (Exception e) {
                    }
                }
                    System.out.println(c);
                    c++;
                    notifyAll();
            }
        }
    }
    void printOdd(){
        synchronized  (this){
            while (c<limit) {
                while(c%2 != 0){
                    try {
                        wait();
                    } catch (Exception e) {
                    }
                }
                    System.out.println(c);
                    c++;
                    notifyAll();    
            }
        }   
    }
}

public class EvenOddSynchronized {

    public static void main(String[] args) {

        EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
        new Thread() {
            public void run() {
                evenOddNumbers.printEven();
            }
        }.start();

        new Thread() {
            public void run() {
                evenOddNumbers.printOdd();
            }
        }.start();
    }
}