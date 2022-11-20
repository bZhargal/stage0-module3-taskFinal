package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void main(String[] args) {
        printIsPositive(0);
        printIsPositive(10);
        printIsPositive(-2);
    }

    public static void printIsPositive(int number) {
        boolean[] responses = {true, false};
        switch (number) {
            case 0 -> System.out.println(false);
            default -> System.out.println(responses[(number >> 31) & 1]);
        }
    }
}
