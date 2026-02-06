import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {

        int number1, number2, number3;
        boolean firstLargest, secondLargest, thirdLargest;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        number3 = sc.nextInt();

        firstLargest  = (number1 > number2 && number1 > number3);
        secondLargest = (number2 > number1 && number2 > number3);
        thirdLargest  = (number3 > number1 && number3 > number2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}
