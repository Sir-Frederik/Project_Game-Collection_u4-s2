package FedericoBrunetti.entitles;

public class VideoGame  extends Game{
    private Platform platform;
    private Genre genre;
    private short durationH;

    public VideoGame(short id, String title, String pubblicationYear, short price, Platform platform, Genre genre, short durationH) {
        super(id, title, pubblicationYear, price);
        this.platform = platform;
        this.genre = genre;
        this.durationH = durationH;
    }

    @Override
    public String toString() {
        return " Tipo: VideoGame" +
                ", Titolo=" + Title  +
                ", id=" + id +
                ",Durata [h]" + durationH +
                ", Piattaforma=" + platform +
                ", Genere=" + genre +


                ", Anno di pubblicazione'" + PubblicationYear +
                ", prezzo=" + price+ "€";

    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public short getDurationH() {
        return durationH;
    }

    public void setDurationH(short durationH) {
        this.durationH = durationH;
    }
}
