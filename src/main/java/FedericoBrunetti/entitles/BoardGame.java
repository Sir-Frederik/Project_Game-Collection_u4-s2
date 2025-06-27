package FedericoBrunetti.entitles;

public class BoardGame extends Game{
    private byte PlayerNumb;
    private short DurationM;

    public BoardGame(short id, String title, String pubblicationYear, short price, byte playerNumb, short durationM) {
        super(id, title, pubblicationYear, price);
        PlayerNumb = playerNumb;
        DurationM = durationM;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "PlayerNumb=" + PlayerNumb +
                ", DurationM=" + DurationM +
                ", id=" + id +
                ", Title='" + Title + '\'' +
                ", PubblicationYear='" + PubblicationYear + '\'' +
                ", price=" + price +
                '}';
    }

    public byte getPlayerNumb() {
        return PlayerNumb;
    }

    public void setPlayerNumb(byte playerNumb) {
        PlayerNumb = playerNumb;
    }

    public short getDurationM() {
        return DurationM;
    }

    public void setDurationM(short durationM) {
        DurationM = durationM;
    }
}
