import java.util.Scanner;
import java.util.ArrayList;


public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("This is a Book 1", 100, 2020));
        books.add(new Book("This is a Book 2", 550, 2021));
        books.add(new Book("This is a Book 3", 321, 2022));
        books.add(new Book("This is a Book 4", 50, 2023));

        System.out.println("What information will be printed ? ");
        String answer = scanner.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (answer.equals("everything")) {
                System.out.println(books.get(i).toString());
            } else if
            (answer.equals("name")) {
                System.out.println(books.get(i).getBookTitle());
            }
        }
    }
}