public class Main {
    public static void main(String[] args) {
        //Test Example
        TreeMultiplier Test = new TreeMultiplier(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        System.out.println(Test);
        System.out.println(" ");
        //Second test with the signed tree multiplier
        SignedTreeMultiplier Test2 = new SignedTreeMultiplier(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        System.out.println(Test2);
        System.out.println(" ");
        TreeMultiplier Test3 = new TreeMultiplier(true, true, true, true, true, true, true, true, true, false, false, false, true, true, false, false);
        System.out.println(Test3);
        System.out.println(" ");
        SignedTreeMultiplier Test4 = new SignedTreeMultiplier(true, true, true, true, true, true, true, true, true, false, false, false, true, true, false, false);
        System.out.println(Test4);
    }
}
