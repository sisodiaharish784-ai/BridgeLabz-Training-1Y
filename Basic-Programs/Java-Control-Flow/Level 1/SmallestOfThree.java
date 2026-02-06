import java.util.Scanner;

class SmallestOfThree {
    public static void main(String[] args) {

        int number1, number2, number3;
        boolean isSmallest;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        number3 = sc.nextInt();

        isSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
