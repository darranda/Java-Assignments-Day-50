public class TvShow {

   private String showName;
    private int episodesNum;
    private String showGenre;

    public TvShow(String showName, int episodesNum, String showGenre) {
        this.showName = showName;
        this.episodesNum = episodesNum;
        this.showGenre = showGenre;
    }

    public TvShow(String showName) {
        this.showName = showName;
    }

    public TvShow(int episodesNum) {
        this.episodesNum = episodesNum;
    }


    public String getName() {
        return showName;
    }

    public int getEpisodes() {
        return episodesNum;
    }

    public String getGenre() {
        return showGenre;
    }

    public String toString() {
        return "The name of the show is " + getName() + " with " + getEpisodes() +
                " number of episodes. The genre is " + getGenre();
    }
}
