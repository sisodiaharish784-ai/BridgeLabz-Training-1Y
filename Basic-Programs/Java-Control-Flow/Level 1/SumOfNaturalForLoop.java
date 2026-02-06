import java.util.Scanner;

class SumNaturalForLoop {
    public static void main(String[] args) {

        int n, sum = 0, formula;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            formula = n * (n + 1) / 2;

            System.out.println("Sum using for loop = " + sum);
            System.out.println("Sum using formula = " + formula);

        } else {
            System.out.println("Not a natural number");
        }
    }
}
