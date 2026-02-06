import java.util.Scanner;

class SumNaturalWhileLoop {
    public static void main(String[] args) {

        int n, sum = 0, formula;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n > 0) {

            while (i <= n) {
                sum = sum + i;
                i++;
            }

            formula = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + formula);

        } else {
            System.out.println("Not a natural number");
        }
    }
}
