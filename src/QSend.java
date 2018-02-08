public class QSend {

    public int[] list;

    public QSend(int[] list) {
        this.list = list;
    }

    public QSend() {
        this.list = new int[]{9, 43, 7, 5, 3, 7, 8, 1, 4, 6, 0, 3465, 875855, 34622};
    }

    private int partition(int[] part, int left, int right) {
        int i = left;
        int j = right;
        int pivot = part[(left + right) / 2];

        while (i <= j) {
            while (part[i] < pivot) {
                i++;
            }
            while (part[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = part[i];
                part[i] = part[j];
                part[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public void qs(int[] part, int left, int right) {
        int index = partition(part, left, right);

        if (left < index -1) {
            qs(part, left, index -1);
        }
        if (index < right) {
            qs(part, index, right);
        }
    }
}
