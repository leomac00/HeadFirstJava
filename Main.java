public class Main {
  public static void main(String[] args) {
    // Heap showcase
    Book a = new Book("AAA");
    Book b = new Book("BBB");
    Book c;
    c = a;
    Book d = new Book("DDD");
    d = null;
    System.out.println("Book 'a'´s Title: " + a.title);
    System.out.println("Book 'b'´s Title: " + b.title);
    System.out.println("Book 'c'´s Title: " + c.title);
    // System.out.println("Book 'd'´s Title: " + d.Title);

    // Array
    Book[] books = new Book[3];
    books[0] = new Book("book[0]");
    books[1] = new Book("book[1]");
    books[2] = books[0];

    System.out.println("Book[0]'s title: " + books[0].title);
    System.out.println("Book[1]'s title: " + books[1].title);
    System.out.println("Book[2]'s title: " + books[2].title);

  }
}
