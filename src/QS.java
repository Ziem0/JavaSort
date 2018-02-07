import java.util.Arrays;
import java.util.List;

public class QS {

    public List<Integer> quickList;
    private int pivot;
    private int nextN;

    public QS() {
        this.quickList = Arrays.asList(3,0,1,8,7,2,5,4,9,6);
    }

    public QS(List<Integer> quickList) {
        this.quickList = quickList;
    }

    public void quickSort(int p, int n, List<Integer> list) {
        int divider = partition(p, n, list);
        if (list.subList(0, divider).size() > 1) {
            quickSort(0, list.subList(0, divider).size() - 1, list.subList(0, divider));
        }
        if (list.subList(divider + 1, list.size()).size() > 1) {
            quickSort(0, list.subList(divider + 1, list.size()).size() - 1, list.subList(divider + 1, list.size()));
        }
        return;
    }

    private int partition(int p, int n, List<Integer> qL) {
        boolean sorted = false;
        int l = 0;
        this.nextN = n;
        this.pivot = p;

        while (!sorted) {

            if (pivot < nextN && qL.get(pivot) > qL.get(nextN)) {
                switchE(pivot, nextN, qL);
                l = pivot;

                for (int i = nextN; i < pivot; ++i) {
                    if (qL.get(pivot) < qL.get(nextN)) {
                        switchE(pivot, nextN, qL);
                        sorted = true;
                        partition(pivot, l, qL);
                    } else {
                        ++nextN;
                    }
                }

            } else if (pivot < nextN) {
                --nextN;
            } else if (pivot == nextN) {
                sorted = true;
            }
        }
        return pivot;
    }

    private void switchE(int pivot, int nextN, List<Integer> qL) {
        int t1 = qL.get(pivot);
        qL.set(pivot, qL.get(nextN));
        qL.set(nextN, t1);
        this.pivot = nextN ;
        this.nextN = pivot;
    }
}
