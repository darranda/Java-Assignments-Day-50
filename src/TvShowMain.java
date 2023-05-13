import java.util.Scanner;
import java.util.ArrayList;

public class TvShowMain {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        ArrayList<TvShow> shows = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the TV Show:");
            String showName = scanner.nextLine();
            if (showName.equals("")) {
                break;
            }
            System.out.println("How many episodes?");
            int episodesNum = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the genre?");
            String showGenre = scanner.nextLine();
            shows.add(new TvShow(showName, episodesNum, showGenre));
        }
        for (TvShow tvShow : shows) {
            System.out.println(tvShow.toString());
        }
    }
}
