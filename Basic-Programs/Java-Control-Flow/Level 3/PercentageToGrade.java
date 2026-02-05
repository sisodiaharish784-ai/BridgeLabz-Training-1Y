import java.util.Scanner;

public class PercentageToGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Physics marks: ");
        int p = sc.nextInt();

        System.out.print("Chemistry marks: ");
        int c = sc.nextInt();

        System.out.print("Maths marks: ");
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;

        System.out.println("percent");

        if (percent >= 80)
            System.out.println("Grade: A");
        else if (percent >= 70)
            System.out.println("Grade: B");
        else if (percent >= 60)
            System.out.println("Grade: c");
        else if (percent >= 50)
            System.out.println("Grade: D");
        else if (percent >= 40)
            System.out.println("Grade: E");
        else
            System.out.println("Grade: R");

        ;
    }
}
