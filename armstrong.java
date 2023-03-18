import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNum = num;
        int result = 0;
        int n = 0;

        // count the number of digits in the given number
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // calculate the sum of nth power of each digit
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // check whether the result is equal to the given number
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
