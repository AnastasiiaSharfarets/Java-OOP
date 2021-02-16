public class PrintReview {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g;
        a = 3;
        b = 5;
        c = 7;
        d = 1;
        e = 15;
        f = 100;
        g = 13;

        int[] array = new int[]{a, b, c, d, e, f, g};

        myPrint(array);

        Swan swen = new Swan();
        swen.name = "Swin";
        swen.age = 10;
        swen.color = "White";
        swen.id = 137;
        swen.toDisplay();
    }

    private static void myPrint(int[] input) {
        for (int each : input) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    private static void myPrint(double[] input) {
        for (double each : input) {
            System.out.print(each + " ");
        }
    }

    private static void myPrint(Swan[] input) {
        for (Swan each : input) {
            each.toDisplay();
        }
    }
}
