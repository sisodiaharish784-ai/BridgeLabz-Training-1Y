import java.util.Scanner;

class CheckNumberSign {
    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
