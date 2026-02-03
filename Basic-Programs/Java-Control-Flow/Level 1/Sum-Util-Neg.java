import java.util.Scanner;
class Sum-Util-Neg {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
int sum = 0;
while (true){
System.out.println("Enter a number :");
int number = sc.nextInt();

if (number <= 0){
break;
}
sum = sum + number;
}
System.out.println("The sum is :" + sum);
}
}