import java.util.Scanner;
class MultipleForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter number: ");
int number = sc.nextInt();

if(number <= 0 || number >= 100){
System.out.println("Enter a positive number less then 100:");
}
else{
System.out.println("Multiple of" + number + "below 100:");

for(int i=100; i>=1; i--){
if (i % number == 0){
System.out.println(i);
}
}
}
}
}