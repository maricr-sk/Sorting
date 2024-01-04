import java.util.Scanner;
import java.io.File;

public class MergeSortTester {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File(args[0]));
        int T = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < T; i++) {
            String [] temp = scan.nextLine().split(" ");
            int [] demo = new int [temp.length];

            for(int j = 0; j < temp.length; ++j){ demo[j] = Integer.parseInt(temp[j]); }

            MergeSort ms = new MergeSort(demo);
            ms.print();
            ms.sort();
            ms.print();
        }
    }
}
