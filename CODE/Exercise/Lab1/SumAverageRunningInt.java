import java.math.*;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;


        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = (double) sum / UPPERBOUND;
        System.out.println("The average is: " + average);


        int count = 0;
        for (int number = 111; number <= 8899; number++) {
            sum += number;
            ++count;
        }
        average = (double) sum / count;
        System.out.println("The average is: " + average);


        int sumSquare = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += (number * number);
        }
        average = (double) sum / UPPERBOUND;
        System.out.println("The sum of square is: " + average);


        int sumOdd = 0, sumEven = 0;
        int absDiff;
        for (int number = LOWERBOUND; number < UPPERBOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);
        System.out.println("Absolute difference: " + absDiff);
    }
}
