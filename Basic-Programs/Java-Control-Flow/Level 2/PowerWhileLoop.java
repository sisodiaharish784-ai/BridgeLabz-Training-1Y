import java.util.Scanner;
class PowerWhileLoop{
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
System.out.println("Enter the power: ");
int power = sc.nextInt();

if (number <= 0 || power >= 0){
System.out.println("Enter positive integer only");
}
else{
int result = 1;
int counter = 0;
while (counter != power){
result = result*number;
counter++;
}
System.out.println(number + "raised to the power" + power +
"is: " + result);
}
}
}