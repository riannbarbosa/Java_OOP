package fdeck;

public class Card {

    private Suit suit;
    private Rank rank;


    protected Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters
    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }





}
