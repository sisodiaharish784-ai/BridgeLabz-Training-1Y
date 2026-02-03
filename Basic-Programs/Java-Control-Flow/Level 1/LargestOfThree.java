import java.util.Scanner;
class LargestOfThree {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the first number :");
int a = sc.nextInt();
System.out.println("Enter the second number :");
int b = sc.nextInt();
System.out.println("Enter the third number :");
int c = sc.nextInt();

if (a>=b && a>=c){
System.out.println("first number is largest then second and third");
}
else if(b>=a && b>=c){
System.out.println("second number is largest then first and third");
}
else if(c>=a && c>=b){
	System.out.println("third number is largest then first and second");
}
else {
	System.out.println("all are equal ");
}
}
}