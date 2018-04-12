import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Paulius on 2017.07.04.
 */
public class Hand implements  Comparable<Hand> {

    private final ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<Card>();
    }

    public  void add(Card card){
        this.hand.add(card);
    }
    public  void print(){
        for(Card card : this.hand) {
            System.out.println(card);
        }
    }
    public void sort(){
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = 0;
        for(Card card : o.hand){
            sum1 += card.getValue();
        }

        int sum2 = 0;
        for(Card card : this.hand){
            sum2 += card.getValue();
        }
        return sum2 - sum1;
    }
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, suitSorter);
    }
}
