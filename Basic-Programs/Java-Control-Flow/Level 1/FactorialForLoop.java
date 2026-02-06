import java.util.Scanner;

class FactorialForLoop {
    public static void main(String[] args) {

        int number;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + number + " is " + factorial);

        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
