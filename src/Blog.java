import java.util.Arrays;
import java.util.Scanner;

public class Blog {
    Post[] posts;
    public Blog( int number ) {
        posts = new Post[number];
    }

    public void addPost( Author author ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię autora:");
        author.setName(scanner.nextLine());
        System.out.println("Podaj nazwisko autora:");
        author.setSurname(scanner.nextLine());
        for (int i = 0; i < posts.length; i++) {
            System.out.println("Podaj tytuł posta:");
            String title = scanner.nextLine();
            System.out.println("Wpisz treść posta:");
            String description = scanner.nextLine();
            posts[i] = new Post(title, description, author,i+1);

        }
    }

    @Override
    public String toString() {
        for (Post p:posts) {
            System.out.println(p.toString());
        }
        return "";
    }
}
