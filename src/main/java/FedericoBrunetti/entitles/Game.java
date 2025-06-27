package FedericoBrunetti.entitles;

public abstract class Game {
    protected short id;
    protected String Title;
    protected String PubblicationYear;
    protected short price;



    public Game(short id, String title, String pubblicationYear, short price) {
        this.id = id;
        Title = title;
        PubblicationYear = pubblicationYear;
        this.price = price;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPubblicationYear() {
        return PubblicationYear;
    }

    public void setPubblicationYear(String pubblicationYear) {
        PubblicationYear = pubblicationYear;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }


}
