
public class Encapsulation {

    String description;
    String title;
    String author;

    public Encapsulation(String author, String description, String title) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    String getDescription(){
        return description;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }
}
