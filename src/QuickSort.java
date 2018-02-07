import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public List<Integer> quickList;
    private int pivot;
    private int nextN;

    public QuickSort() {
        this.quickList = Arrays.asList(123,43,74,866,86643,45764346,88654,0,53,1);
    }

    public QuickSort(List<Integer> quickList) {
        this.quickList = quickList;
    }

    public void startQuickSort(int n, int p) throws StackOverflowError{
        boolean sorted = false;
        int l;
        this.nextN = n;
        this.pivot = p;

        while (!sorted) {
            if (pivot<nextN  &&  quickList.get(pivot) > quickList.get(nextN)) {
                switchE(pivot, nextN);
                l = pivot;

                for (int i = nextN; i < l; ++i) {
                    if (quickList.get(pivot) < quickList.get(nextN)) {
                        switchE(pivot, nextN);
                        startQuickSort(l, pivot);
                    } else {
                        ++nextN;
                    }
                }

            } else if (nextN > pivot) {
                --nextN;
            } else {
                sorted = true;
                if (pivot < quickList.size() - 1) {
                    startQuickSort(quickList.size() - 1, pivot + 1);
                }
                else if (pivot > 0) {
                    startQuickSort(pivot, 0);
                }
            }
        }
    }

    private void switchE(int pivot, int nextN) {
        int t1 = quickList.get(pivot);
        quickList.set(pivot, quickList.get(nextN));
        quickList.set(nextN, t1);
        this.pivot = nextN ;
        this.nextN = pivot;
    }
}