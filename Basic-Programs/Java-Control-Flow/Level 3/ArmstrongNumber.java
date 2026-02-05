import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int rem ;

        while (num > 0) {
            rem = num % 10;  
            sum = sum + rem*rem*rem; 
            num = num / 10;       
        }

        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
