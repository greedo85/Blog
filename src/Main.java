import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main( String[] args ) {
        Blog blog=new Blog();
        blog.addPost("Tytuł", "Opis");
        System.out.println(blog);
    }
}
