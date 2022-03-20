package Streams;
import java.util.*;
import java.util.stream.Collectors;

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

public class BookMarket {
    public static void main(String[] args) {
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println("Initial Books");
        books.stream().forEach(System.out::println);

        System.out.println("Set of Books");
        Set<Book> bookSet = books.stream().collect(Collectors.toSet());
        bookSet.stream().forEach(System.out::println);

        System.out.println("Sorting by id");
        List<Book> sortedById = books.stream().sorted((p1, p2) -> p1.getId() - p2.getId()).collect(Collectors.toList());
        sortedById.stream().forEach(System.out::println);

        books.stream().map(p1 -> {
            p1.quantity *= 2;
            return p1;}).collect(Collectors.toList());
        System.out.println("Books after Doubling quantity");
        books.stream().forEach(System.out::println);
        
        List<Book> quantityBooks = books.stream().filter(p1 -> p1.quantity > 10).collect(Collectors.toList());
        System.out.println("Books after filtering with quantity>10");
        quantityBooks.stream().forEach(System.out::println);
        
        int soldQuantity = books.stream().filter(p1 -> p1.id<200).map(p1->p1.quantity).reduce(0,(res,p1)->res+p1);
        System.out.println("Quantity sold : "+soldQuantity);
    }
}
