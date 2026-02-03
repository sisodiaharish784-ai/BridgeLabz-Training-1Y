import java.util.Scanner;
class SmallestOfThree {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the first number :");
int a = sc.nextInt();
System.out.println("Enter the second number :");
int b = sc.nextInt();
System.out.println("Enter the third number :");
int c = sc.nextInt();

if (a<b && a<c){
System.out.println("first number smaller then others");
}
else{
System.out.println("other number is small");
}
}
}