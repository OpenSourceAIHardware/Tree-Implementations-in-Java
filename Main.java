import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> SearchData = new ArrayList<>(Arrays.asList(-25, -15, -7, 10, 12, 13, 17, 19, 20, 21, 23, 27, 29, 51, 56, 135, 156, 254, 256, 275, 345, 546, 577, 583, 677, 684, 695, 700, 701, 757, 760, 767, 797, 800, 888, 999, 1005, 1010, 1011, 1024, 2048, 4096));
        BinaryTree Test = new BinaryTree(SearchData, 999);
        //Test.TreeScanner();
        System.out.println(Test.NodeList[31].LeftOutput());
        System.out.println(Test.NodeList[31].RightOutput());
        System.out.println(Test.NodeList[39].Input());
        System.out.println(Test.NodeList[39].LeftOutput());
        System.out.println(Test.NodeList[39].RightOutput());
        System.out.println(Test.NodeList[40].Input());
        System.out.println(Test.NodeList[41].LeftOutput());
        System.out.println(Test.NodeList[41].RightOutput());
    }
}