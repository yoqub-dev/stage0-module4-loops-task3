package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int multiplier = 1;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int term = 9 * multiplier;
            sum += term;
            multiplier = multiplier * 10 + 1;
        }
        System.out.println(sum);
    }
}
