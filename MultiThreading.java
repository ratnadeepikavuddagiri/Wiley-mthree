class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println("5 x "+i+" = "+(5*i));
        System.out.println("T1 Terminating");
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        String[] countries ={"India","Korea","Japan","China","Germany"};
        for(int i=0;i<countries.length;i++)
            System.out.println(countries[i]);
        System.out.println("T2 Terminating");
    }
    
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t = new MyThread2();
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
        System.out.println("Main Thread Running.");
        System.out.println("Deepika");
        System.out.println("Andhra Pradesh");
        System.out.println("Drawing");
        System.out.println("Main Thread Terminating.");
    }
}
