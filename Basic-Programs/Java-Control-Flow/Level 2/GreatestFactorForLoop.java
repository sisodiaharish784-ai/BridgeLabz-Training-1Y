import java.util.Scanner;
class GreatestFactorForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number: ");
int number = sc.nextInt();

int greatestFactor = 1;

if(number <= 1){
System.out.println("Factor not exist");
}
else{
for (int i=number-1; i>=1; i--){
if (number % i == 0){
greatestFactor = i;
break;
}
}
System.out.println("Greatest Factor of " + number + "beside itself is: "
+ greatestFactor);
}
}
}