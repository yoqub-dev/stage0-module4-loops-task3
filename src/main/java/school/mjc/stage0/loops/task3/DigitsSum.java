package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numStr = t + "";
        int sum = 0;
        int length = numStr.length();

        for (int i = 0; i < length; i++) {
            char digitChar = numStr.charAt(i);
            int digit = digitChar - '0';
            sum += digit;
        }
        System.out.println(sum);
    }
}
