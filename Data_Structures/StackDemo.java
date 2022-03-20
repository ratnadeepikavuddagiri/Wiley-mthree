package Data_Structures;
import java.util.*;
class StackADT{
    int top=-1;
    int size;
    int[] stack;
    StackADT(int size){
        this.size = size;
        stack = new int[size];
    }

    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==size-1;
    }

    void push(int n){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else
            stack[++top] =n;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        return stack[top--];
    }

    void display(){
        int temp=top;
        while(temp>=0){
            System.out.print(stack[temp--]+" ");
        }
    }
    int peek(){
        return stack[top];
    }

}
public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Stack :");
        int n=scanner.nextInt();
        StackADT stackADT = new StackADT(n);
        stackADT.push(10);
        stackADT.push(20);
        stackADT.push(30);
        stackADT.display();
        System.out.println();
        System.out.println("Element popped :"+stackADT.pop());
        System.out.println("Peek :"+stackADT.peek());
        stackADT.display();
    }
    
}
