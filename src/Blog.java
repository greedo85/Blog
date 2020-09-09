import java.util.Arrays;

public class Blog {

    Post posts;

    public void addPost(String title,String description)
    {
        posts=new Post(title,description);
    }

    @Override
    public String toString() {
        return posts.toString();
    }
}
