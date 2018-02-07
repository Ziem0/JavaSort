import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Dao {


    private static final String fifty = "src/resources/fifty_thousand.txt";
    private static final String one = "src/resources/one_thousand.txt";
    private static final String million = "src/resources/one_million.txt";
    private static List<Integer> box = new LinkedList<>();
    public static Integer[] box1;


    public static List<Integer>  chooseData() throws IOException {
        Command.getOptions();
        int choice = Command.getNumber();
        switch (choice) {
            case 1:
                loadData(Dao.fifty, 50000);
                break;
            case 2:
                loadData(Dao.one, 1000);
                break;
            case 3:
                loadData(Dao.million, 1000000);
                break;
        }
        return box;
    }


    private static void loadData(String pathFile, int size) throws IOException {
        FileReader fr = new FileReader(pathFile);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            box.add(Integer.valueOf(line));
        }
    }



    public static Integer[]  chooseData2() throws IOException {
        Command.getOptions();
        int choice = Command.getNumber();
        switch (choice) {
            case 1:
                loadData2(Dao.fifty, 50000);
                break;
            case 2:
                loadData2(Dao.one, 1000);
                break;
            case 3:
                loadData2(Dao.million, 1000000);
                break;
        }
        return box1;
    }


    private static void loadData2(String pathFile, int size) throws IOException {
        FileReader fr = new FileReader(pathFile);
        BufferedReader br = new BufferedReader(fr);
        String line;
        box1 = new Integer[size];
        int counter = 0;

        while ((line = br.readLine()) != null) {
            box1[counter] = Integer.valueOf(line);
            counter++;
        }
    }
}


