import java.time.LocalDate;
import java.util.Date;

public class Post extends Author {
    LocalDate localDate;
    Author author;
    private String title;
    private String description;

    public void setTitle( String title ) {
        this.title = title;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    private static int id=0;
    private int postNumber;

    public Post(String title, String description, Author author, int postNumber) {
        this.author = author;
        this.postNumber=postNumber;
        this.title = title;
        this.description = description;
        localDate = LocalDate.now();
        id++;
    }

    @Override
    public String toString() {
        super.toString();
        return "Post id: " +postNumber+
                "\ndata: " + localDate +"\n"+
                 author +
                "Tytuł: " + title + "\n" +
                "Treść: " + description+"\n" ;
    }
}
