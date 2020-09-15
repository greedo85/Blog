import java.util.Arrays;
import java.util.Scanner;

public class Blog {
    Post[] posts;
    Author [] author;
    private int postIterator=0;
    private int authorIterator=0;
    Scanner scanner = new Scanner(System.in);
    public Blog( int number ) {
        posts = new Post[number];
        author=new Author[number];
    }
    public void addAuthor()
    {
        author[authorIterator]=new Author();
        System.out.println("Podaj imię autora:");
        author[authorIterator].setName(scanner.nextLine());
        System.out.println("Podaj nazwisko autora:");
        author[authorIterator].setSurname(scanner.nextLine());
        authorIterator++;
    }
    public void addPost() {
     
        System.out.println("Podaj tytuł posta:");
        String title = scanner.nextLine();
        System.out.println("Wpisz treść posta:");
        String description = scanner.nextLine();
        System.out.println("Dodaj autora nr: ");
        int authorNumber= scanner.nextInt()-1;
        posts[postIterator] = new Post(title, description, author[authorNumber],postIterator+1);
        postIterator++;

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
