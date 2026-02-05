import java.util.Scanner;
class PowerForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
System.out.println("Enter the power: ");
int power = sc.nextInt();

if(number <= 0 || Power < 0){
System.out.println("Enter positive integers only:");
}
else{
int result = 1;

for(int i = 1; i <= power; i++){
result = result * number;
}
System.out.println(number + "raised to the power"
+ power +"is:" + result);
}
}
}