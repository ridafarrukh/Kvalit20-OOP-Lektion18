public class Card {

    //klöver = CLUBS   (♣)
    //ruter = DIAMONDS (♦)
    //hjärter = HEARTS (♥)
    //spader = SPADES  (♠)

    //Konstanter
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS= 2;
    public static final int SPADES = 3;

    //flera konstanter
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    //instanvariabler/egenskaper

    public int suit; //färg - Använder konstanter
    public int rank; //valör - heltal mellan 1 til 13

    //    0    1   2   3   4   5    6    7    8    9    10    11     12      13
    // "null" "1","2","3","4","5", "6", "7", "8", "9", "10","Jack", "Queen", "King".

    public static final String[] RANKS = { null ,"1","2","3","4","5","6","7","8","9","10",
            "JACK","QUEEN","KING"};
    public static final String[] SUITS = {"CLUBS","DIAMONDS","HEARTS","SPADES"};
    public static final String[] SUITS_unicode = {"\u2667", "\u2662", "\u2661", "\u2664"};


    public static void Print(Card c) {

        System.out.println(c.rank + " of " + c.suit);
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS[c.suit]);
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS_unicode[c.suit]);
    }
    public static Card getInstance(int rank, int suit) {
        Card c = new Card();
        c.rank = rank;
        c.suit = suit;
        return c;
    }
    public static Card getInstance() {
        Card c = new Card();
        c.suit = (int) (Math.random() * 4 );  // Färg
        c.rank = (int) (Math.random() * 13) + 1;  // Valör
        return c;
    }



}
