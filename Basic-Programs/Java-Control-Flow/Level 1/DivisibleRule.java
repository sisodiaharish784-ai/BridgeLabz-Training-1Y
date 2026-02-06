import java.util.Scanner;

class DivisibleRule {
    public static void main(String[] args) {

        int number;

        boolean isDivisible;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
