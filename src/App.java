import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
//        QS quick = new QS(Dao.chooseData());
        QS quick = new QS();
        long start0 = System.nanoTime();
        quick.quickSort(0, quick.quickList.size() - 1, quick.quickList);
        long end0 = System.nanoTime();
        long v0 = end0 - start0;
        System.out.println(v0 + " seconds for quickSort!");

        BubbleSort standard1 = new BubbleSort("list");
        long start3 = System.nanoTime();
        standard1.standardSort();
        long end3 = System.nanoTime();
        long v2 = end3 - start3;///(Math.pow(10, 9));
        System.out.println(v2 + " seconds for objectList with default sorting!");

        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.sort();
        long end = System.nanoTime();
        long v = (end - start);///(Math.pow(10, 9));
        System.out.println(v + " seconds for primitiveList!");

        BubbleSort bubbleSort1 = new BubbleSort("list");
        long start1 = System.nanoTime();
        bubbleSort1.sort2();
        long end1 = System.nanoTime();
        long v1 = ((end1 - start1));///(Math.pow(10, 9)));
        System.out.println(v1 + " seconds for objectList!");


        System.out.println("\n====================================\n");
        if (v - v1 < 0) {
            System.out.println("Primitive list is faster than standardList for about " + Math.abs(v - v1) + " sec!");
        } else {
            System.out.println("Standard list is faster than primitiveList for about " + (v - v1) + " sec!");
        }

        ArrayList<Long> all = new ArrayList<Long>() {{
//            add(v0);
            add(v);
            add(v0);
            add(v1);
            add(v2);
        }};

        System.out.println("\n====================================\n");
        all.sort(Long::compareTo);
        for (Long i : all) {
            System.out.println(i);
        }
    }

    public static void print(ArrayList<Integer> list) {
        for (int z : list) {
            System.out.println(z);
        }
    }
}
