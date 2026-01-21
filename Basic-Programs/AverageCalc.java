import java.util.Scanner;
public class AverageCalc{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 number:");
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double avg = (a+b+c)/3;
System.out.println("Average value is:"+avg);
}
}