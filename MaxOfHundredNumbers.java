import java.util.Scanner;

public class MaxOfHundredNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 100 numbers:");

        for (int i = 1; i <= 100; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
        scanner.close();
    }
}
