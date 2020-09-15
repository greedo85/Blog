import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main( String[] args ) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Blog blog = new Blog(4);
        char choice;
        do {
            System.out.println("\nWybierz co zrobić:");
            System.out.println("d - dodaj post");
            System.out.println("a - dodaj autorów");
            System.out.println("w - wyświetl posty");
            System.out.println("e - edytuj post");
            System.out.println("q - zakończ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'd':
                    blog.addPost();
                    break;
                case 'w':
                    try {
                        System.out.println(blog);
                    } catch (NullPointerException e) {
                        System.out.println("Post jest pusty");
                        continue;
                    }
                    break;
                case 'e':
                    System.out.println("Podaj numer posta do edycji:");
                    blog.editPost(scanner.nextInt());
                case 'a':
                    try {
                    blog.addAuthor();

                    }
                    catch (NullPointerException e)
                    {
                        continue;
                    }
                    break;
                case 'c':
                    continue;

            }

        }
        while (choice != 'q');
    }
}
