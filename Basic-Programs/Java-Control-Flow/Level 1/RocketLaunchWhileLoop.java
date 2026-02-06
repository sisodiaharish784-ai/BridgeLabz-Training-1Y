import java.util.Scanner;

class RocketLaunchWhileLoop {
    public static void main(String[] args) {

        int counter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println(" Launch!");
    }
}
