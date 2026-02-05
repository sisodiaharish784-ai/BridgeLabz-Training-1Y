import java.util.Scanner;
class GreatestFactorWhileLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number");
int num = sc.nextInt();

int GreatestFactor = 1;

if (num <= 0){
System.out.println("Factor not exist");
}
else{
int i = num - 1;
while (i >= 1){
if (num % i == 0){
GreatestFactor = i;
break;
}
i--;
}
System.out.println("Greatest Factor of " + num + "beside 
ifseif is: " + GreatestFactor);
}
}
}