import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int rem ;


        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }

        if (temp % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
