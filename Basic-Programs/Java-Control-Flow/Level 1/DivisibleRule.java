import java.util.Scanner;
public class DivisibleRule {
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
if(num%5 == 0){
System.out.println(num + "the number is divisible by 5");
}
else{
System.out.println(num + "the number is not divisible by 5");
}
}
}