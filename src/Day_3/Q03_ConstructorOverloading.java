package Day_3;

class Book {
    String title;
    String author;

    // Constructor 1
    Book(String t) {
        title = t;
        author = "Unknown";
    }

    // Constructor 2
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

public class Q03_ConstructorOverloading {
    public static void main(String[] args) {
        Book b1 = new Book("Java Essentials");
        Book b2 = new Book("OOP in Java", "John Smith");

        b1.display();
        b2.display();
    }
}

