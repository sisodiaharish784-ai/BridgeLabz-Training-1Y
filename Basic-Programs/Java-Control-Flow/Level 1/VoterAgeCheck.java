import java.util.Scanner;

class VoterAgeCheck {
    public static void main(String[] args) {

        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
