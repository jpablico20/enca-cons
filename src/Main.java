
public class Main {
    public static void main(String[] args) {

        constructor consName = new constructor("Jorim Pablico");
        constructor add = new constructor(6, 5);

        Encapsulation book = new Encapsulation("Java", "Android",
                "Jorim");

        System.out.println("title: " + book.getTitle());
        System.out.println("description: " + book.getDescription());
        System.out.println("author: " + book.getAuthor());

        }
    }