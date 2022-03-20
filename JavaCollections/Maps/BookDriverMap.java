package JavaCollections.Maps;

import java.util.*;

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
    

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class BookDriverMap {
    public static void main(String[] args) {
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
        HashMap<Integer,Book> books = new HashMap<>();
        books.put(b1.getId(),b1);
        books.put(b2.getId(),b2);
        books.put(b3.getId(),b3);
        books.put(b4.getId(),b4);
        System.out.println("Initial Book Details");
        
        for(Book book : books.values())
            System.out.println(book);
        Iterator<Integer> iterator = books.keySet().iterator();
        System.out.println("Book Details after doubling the quantity");
        while(iterator.hasNext()){
            Integer key =iterator.next();
            Book book = books.get(key);
            int quantity = book.getQuantity();
            book.setQuantity(quantity*2);
            books.put(key,book);
        }
        for(Book book : books.values())
            System.out.println(book);

        books.merge(233,books.get(233),(oldBook,newBook) -> {
            String str =oldBook.getPublisher();
            newBook.setPublisher(str+" USA"); 
            return newBook;
        });
        System.out.println(books.get(233));
    
    }
}


