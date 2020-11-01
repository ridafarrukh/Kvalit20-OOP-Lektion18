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
        System.out.println("******* CARD 1 *******");
        System.out.println(c.rank + " of " + c.suit);
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS[c.suit]);
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS_unicode[c.suit]);
    }
    public static Card getInstance(int queen, int spades) {
        Card c1 = new Card();
        c1.rank = queen;
        c1.suit = spades;
        return c1;
    }


}
