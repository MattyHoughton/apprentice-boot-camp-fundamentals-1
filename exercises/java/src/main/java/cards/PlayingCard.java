package cards;

public class PlayingCard implements Card{
    private Suit suit;
    private int faceValue;

    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String suitOf() {
        return suit.getSuit();
    }

    public int valueOf() {
        return this.faceValue;
    }

    public Boolean snap( Card otherCard )
        { PlayingCard cardPlaying = (PlayingCard) otherCard;
            return cardPlaying != null && this.faceValue == cardPlaying.faceValue;
        }
}
