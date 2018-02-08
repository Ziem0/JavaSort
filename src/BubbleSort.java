import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class BubbleSort {
    private int[] unsortedSorted2;
    private List<Integer> unsortedSorted;
    private boolean sorted = false;


    public BubbleSort() throws IOException {
        this.unsortedSorted2 = Dao.chooseData2();
    }

    public BubbleSort(String list) throws IOException {
        this.unsortedSorted = Dao.chooseData();
    }

    public void sort() {
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < unsortedSorted2.length; ++i) {
                if (unsortedSorted2[i] < unsortedSorted2[i - 1]) {
                    sorted = false;
                    int t = unsortedSorted2[i];
                    unsortedSorted2[i] = unsortedSorted2[i - 1];
                    unsortedSorted2[i - 1] = t;
                }
            }
        }
    }

    public void sort2() {
        ListIterator<Integer> i = unsortedSorted.listIterator();
        int counter = 0;

        while (!sorted) {
            sorted = true;
            while (i.hasNext()) {
                if (unsortedSorted.get(counter) > i.next()) {
                    sorted = false;
                    int t = unsortedSorted.get(counter);
                    i.set(i.next());
                    unsortedSorted.set(counter + 1, t);
                }
                ++counter;
            }
        }

    }


    public void standardSort() {
        Collections.sort(unsortedSorted);
    }


    public void print() {
        for (int i : unsortedSorted2) {
            System.out.println(i);
        }
    }
}
