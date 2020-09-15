import java.util.Arrays;
import java.util.Scanner;

public class Blog {
    Post[] posts;
    Author author;
    private int iterator=0;
    Scanner scanner = new Scanner(System.in);
    public Blog( int number ) {
        posts = new Post[number];
    }

    public void addPost() {
        author=new Author();
        System.out.println("Podaj imię autora:");
        author.setName(scanner.nextLine());
        System.out.println("Podaj nazwisko autora:");
        author.setSurname(scanner.nextLine());

        System.out.println("Podaj tytuł posta:");
        String title = scanner.nextLine();
        System.out.println("Wpisz treść posta:");
        String description = scanner.nextLine();
        posts[iterator] = new Post(title, description, author,iterator+1);
        iterator++;

    }
    public void editPost(int postNumber)
    {
        System.out.println("Wpisz nowy tytuł: ");
        posts[postNumber-1].setTitle(scanner.nextLine());
        System.out.println("Wpisz nową treść: ");
        posts[postNumber-1].setDescription(scanner.nextLine());
    }

    @Override
    public String toString() {
        for (Post p:posts) {
            System.out.println(p.toString());
        }
        return "";
    }
}
