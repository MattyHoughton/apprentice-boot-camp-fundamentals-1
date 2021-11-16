package cards;

public class Suit {
    private String name;

    public Suit(int suitNum) {
        switch (suitNum) {
            case 0:
                this.name = "clubs";
                break;
            case 1:
                this.name = "diamonds";
                break;
            case 2:
                this.name = "hearts";
                break;
            case 3:
                this.name = "spades";
                break;
            default:
                throw new IllegalArgumentException("Something went wrong " + suitNum + "is not a valid suitName!");
        }
    }

    public String getSuit() {
        return this.name;
    }
}
