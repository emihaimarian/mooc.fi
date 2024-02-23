
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {

    private List<Card> hands;

    public Hand() {
        this.hands = new ArrayList<>();
    }

    public void add(Card card) {
        this.hands.add(card);
    }

    public void print() {
        this.hands.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {

        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        Collections.sort(hands, comparator);

    }

    @Override
    public int compareTo(Hand hand) {

        int thisHandValue = this.hands.stream().mapToInt(Card::getValue).sum();
        int handToCompare = hand.hands.stream().mapToInt(Card::getValue).sum();

        return thisHandValue - handToCompare;
    }

    public void sortBySuit() {
        Collections.sort(this.hands, new BySuitInValueOrder());
    }
}
