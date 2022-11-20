package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result;

        for (result = 0; number != 0; number /= 10) {
            result += number%10;
        }

        System.out.println(result);
    }
}
