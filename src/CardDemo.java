public class CardDemo {
    public static void main(String[] args) {


        System.out.println("*** card 1 ***");
        Card c1 = Card.getInstance(Card.QUEEN, Card.SPADES);
        Card.Print(c1);

        System.out.println("*** card 2 ***");
        Card c2 = Card.getInstance(7, Card.CLUBS);
        Card.Print(c2);

        System.out.println("*** card 3 ***");
        Card c3 = Card.getInstance(Card.JACK, Card.DIAMONDS);
        Card.Print(c3);

        System.out.println("*** card 4 ***");
        Card c4 =Card. getInstance(Card.KING, Card.HEARTS);
        Card.Print(c4);

        System.out.println("***  Slumpgenereade kort ***");
        for (int i = 0; i < 5; i++) {
            Card c = Card.getInstance();
            Card.Print(c);
        }
    }





}
