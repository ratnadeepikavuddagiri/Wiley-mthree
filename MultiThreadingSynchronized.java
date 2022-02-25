import java.io.*;

class ShakespeareClass{
    synchronized void writeEpicStuff(String str){        
        int n = str.length();
        try(FileWriter writer = new FileWriter("play2.txt",true);) {
                for(int i=0;i<n;i++){
                    writer.write(str.charAt(i));    
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
class MyThread3 extends Thread{
    private String content;
    private ShakespeareClass shakespeare;
    MyThread3(String content,ShakespeareClass shakespeare2){
        this.content = content;
        this.shakespeare = shakespeare2;
    }
    @Override
    public void run(){
            this.shakespeare.writeEpicStuff(this.content);
    }
}

public class MultiThreadingSynchronized {
    public static void main(String[] args) {
        ShakespeareClass shakespeare = new ShakespeareClass();
        MyThread3 t1 = new MyThread3("Et tu Brutus!",shakespeare);
        MyThread3 t2 = new MyThread3("Hamlet is a small village",shakespeare);
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
