import java.io.*;

class Shakespeare{
    void writeEpicStuff(String str){
        int n = str.length();
        try(FileWriter writer = new FileWriter("play1.txt",true);) {
                for(int i=0;i<n;i++){
                    char ch = str.charAt(i);
                    writer.write(ch);
                    System.out.print(str.charAt(i));
                }
                writer.write("\n");
                writer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}
class MyThread extends Thread{
    private String content;
    private Shakespeare shakespeare;
    MyThread(String content,Shakespeare shakespeare){
        this.content = content;
        this.shakespeare = shakespeare;
    }
    public void run(){
            this.shakespeare.writeEpicStuff(this.content);
    }
}
public class MultiThreadingNonSynchronized {
    
    public static void main(String[] args) {
        Shakespeare shakespeare = new Shakespeare();
        MyThread t1 = new MyThread("Et tu Brutus!",shakespeare);
        MyThread t2 = new MyThread("Hamlet is a small village",shakespeare);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    } 
}
