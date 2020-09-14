import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main( String[] args ) {
        Blog blog=new Blog(2);
        blog.addPost(new Author());
        System.out.println(blog);

    }
}
