package JavaCollections;

import java.util.ArrayList;

class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
    
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (this.author == null) {
            if (other.author != null)
                return false;
        } else if (!this.author.equals(other.author))
            return false;
        if (this.id != other.id)
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        return true;
    }

}
public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        int dupCount=0;
        //boolean[] duplicate = new boolean[bookList.size()]; 
        ArrayList<Book> duplicateList = new ArrayList<>();
        for(int i=0; i<bookList.size(); i++) {
            for(int j=i+1; j<bookList.size(); j++){
                if(bookList.get(j).equals(bookList.get(i))){
                    dupCount++;
                    duplicateList.add(bookList.get(j));
                    bookList.remove(j);
                    bookList.remove(i);
                }
            }
        }
        System.out.println("No. of duplicate books = "+dupCount);
        for(int i=0;i<duplicateList.size(); i++){
            System.out.println(duplicateList.get(i));
        }
        int maxQuantity = 0;
        Book temp=null;
        for(int i=0;i<bookList.size(); i++){
            if(bookList.get(i).quantity>maxQuantity){
                    maxQuantity = bookList.get(i).quantity;
                    temp = bookList.get(i);
            }
        }
        System.out.println(temp);
    
    }
}
