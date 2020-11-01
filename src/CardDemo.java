public class CardDemo {
    public static void main(String[] args) {



        Card c1 = Card.getInstance(Card.QUEEN, Card.SPADES);
        Card.Print(c1);

        Card c2 = Card.getInstance(7, Card.CLUBS);
        Card.Print(c2);

        Card c3 = Card.getInstance(Card.JACK, Card.DIAMONDS);
        Card.Print(c3);


        Card c4 =Card. getInstance(Card.KING, Card.HEARTS);
        Card.Print(c4);

    }





}
