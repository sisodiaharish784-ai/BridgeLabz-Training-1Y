import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {

        int number;
        int sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number > 0) {   // natural number check
            sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
