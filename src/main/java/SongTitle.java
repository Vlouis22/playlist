public class SongTitle extends Title {
    String genre;

    public SongTitle(String genre) {
        this.genre = genre;
    }

    public SongTitle(String name, String genre) {
        super(name);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString()+"genre='" + genre + '\'' + '\n';
    }
}
