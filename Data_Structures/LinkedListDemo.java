package Data_Structures;

import java.util.NoSuchElementException;

class LinkedList{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    boolean isEmpty(){
        return head==null;
    }

    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    void insertAtFirst(int data){
        Node node = new Node(data);
        if(isEmpty())
            head=node;
        else{
            node.next=head;
            head = node;
        }
    } 

    void insertAtLast(int data){
        Node node = new Node(data);
        if(isEmpty())
        head=node;
        else{
            Node temp=head;
            while(temp.next!=null)                
                temp=temp.next;
            temp.next=node;
        }
    }

    void insertAtPosition(int data,int index){
        Node node = new Node(data);
        Node temp=head;
        if(isEmpty())
            System.out.println("List is Empty");
        else if(index==size()+1)
            insertAtLast(data);
        else if(index>size())
            System.out.println("No such index "+index);

        else{
            while(index !=2 &&(temp.next!=null)){
                temp=temp.next;
                index--;
            }
            if(temp.next!=null){
                node.next=temp.next;
                temp.next=node;
            }
        }
    }

    void delete(int data){
        if(isEmpty())
            System.out.println("List is Empty");
        else if(head.data==data)
            head=head.next;
        else if(!(isContains(data)))
            System.out.println("No such value "+data);
        else{
            Node temp=head;
            while(temp.next.data != data)
                temp=temp.next;
            temp.next =temp.next.next;
        }
    }

    void replace(int oldVal,int newVal){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        if(!(isContains(oldVal)))
            System.out.println("No such value "+oldVal);
        else{
            Node temp = head;
            while(temp.next.data != oldVal)
                temp=temp.next;
            temp.next.data = newVal;
        }

    }

    boolean isContains(int data){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                if(temp.data==data)
                return true;
                temp=temp.next;
            }
        }
        return false;
    }

    void traverse(){
        Node temp=head;
        if(isEmpty())
            System.out.println("List is Empty");
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtFirst(20);
        list.insertAtFirst(50);
        list.insertAtLast(60);
        list.insertAtPosition(70,3);
        list.insertAtPosition(80,5);
        list.insertAtPosition(90,10);
        list.traverse();
        System.out.println();
        list.delete(50);
        list.replace(90,100);
        list.traverse();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isContains(30));

    }
}
