package cards;

public class PlayingCardDeck {
    private PlayingCard[] deck;

    public PlayingCardDeck() {
        this.deck = new PlayingCard[52];
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit newSuit = new Suit(suit);
                PlayingCard card = new PlayingCard(newSuit, faceValue);
                this.deck[suit * 13 + faceValue] = card;
            }
        }
    }

    public String[] populate(String[] result) {
        int cardNumber = 0;
        for (PlayingCard card : this.deck) {
            String faceValueName;
            switch (card.valueOf()) {
                case 0:
                    faceValueName = "ace";
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    faceValueName = Integer.toString(card.valueOf() + 1);
                    break;
                case 10:
                    faceValueName = "jack";
                    break;
                case 11:
                    faceValueName = "queen";
                    break;
                case 12:
                    faceValueName = "king";
                    break;
                default:
                    throw new IllegalArgumentException("Something went wrong " + card.valueOf() + "is not a valid faceValue!");
            }

            result[cardNumber] = faceValueName + " of " + card.suitOf();
            cardNumber++;
        }

        return result;
    }

}
