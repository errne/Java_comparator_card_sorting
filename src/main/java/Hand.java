
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;

    public Hand() {

        this.hand = new ArrayList();
    }

    public void add(Card card) {

        this.hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card.toString());
        }
    }

    public void sort() {

        Collections.sort(hand);

    }

    public int getHandValue(){
        int handValue = 0;
        for (Card card : hand) {
            handValue += card.getValue();
        }
        return handValue;
    }

    public int compareTo(Hand other) {

        return this.getHandValue() - other.getHandValue();
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }

}
