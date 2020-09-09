import java.time.LocalDate;
import java.util.Date;

public class Post implements ID {
    LocalDate localDate;
    private String title;
    private String description;
    static int id=0;
    public Post( String title, String description) {
        this.title = title;
        this.description = description;
        localDate=LocalDate.now();
        id++;
    }


    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                "ID: "+id+" Date: "+localDate+
                '}';
    }
}
