package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        PlayingCardDeck cardDeck = new PlayingCardDeck();

        result = cardDeck.populate(result);
        return result;
    }

    public class PlayingCard{
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
    }

    public class Suit{
        private String name;

        public Suit(int suitNum) {
            switch (suitNum){
                case 0: this.name = "clubs"; break;
                case 1: this.name = "diamonds"; break;
                case 2: this.name =  "hearts"; break;
                case 3: this.name =  "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + suitNum + "is not a valid suitName!");
            }
        }

        public String getSuit() {
            return this.name;
        }
    }

    public class PlayingCardDeck {
        private PlayingCard[] deck;

        public PlayingCardDeck() {
            this.deck = new PlayingCard[52];
            for (int suit = 0; suit < 4; suit++) {
                for (int faceValue = 0; faceValue < 13; faceValue++) {
                    Suit newSuit = new Suit(suit);
                    PlayingCard card = new PlayingCard(newSuit, faceValue);
                    this.deck[suit*13+faceValue] = card;
                }
            }
        }

        public String[] populate(String[] result) {
            int cardNumber = 0;
            for (PlayingCard card : this.deck) {
                String faceValueName;
                switch (card.valueOf()){
                    case 0: faceValueName = "ace"; break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: faceValueName = Integer.toString(card.valueOf()+1); break;
                    case 10: faceValueName = "jack"; break;
                    case 11: faceValueName = "queen"; break;
                    case 12: faceValueName = "king"; break;
                    default: throw new IllegalArgumentException("Something went wrong " + card.valueOf() + "is not a valid faceValue!");
                }

                result[cardNumber] = faceValueName + " of " + card.suitOf();
                cardNumber++;
            }

            return result;
        }

    }
}


