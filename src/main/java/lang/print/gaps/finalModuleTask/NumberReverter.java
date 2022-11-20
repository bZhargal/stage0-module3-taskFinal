package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = 0;
        int numberToReverse = Math.abs(number);

        while (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            result = result * 10 + mod;
            numberToReverse /= 10;
        }

        System.out.println(number > 0 ? result : result * -1);
    }
}
