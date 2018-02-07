public class QSend {

    public int[] list;

    public QSend() {
        this.list = new int []{3, 6, 4, 5, 47, 65, 4, 685, 56, 536, 43365, 357, 45, 574, 53, 635};
    }

    private int partition(int arr[], int left, int right) {

        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }

    public void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    public static void main(String[] args) {
        QSend qs = new QSend();
        qs.quickSort(qs.list, 0, qs.list.length-1);

        for (int i : qs.list) {
            System.out.println(i);
        }

    }

}
