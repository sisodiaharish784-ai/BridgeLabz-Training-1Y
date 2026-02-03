import java.util.Scanner;
class NaturalNumber {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number :");
int a = sc.nextInt();
int sum = 0;
if (a>=0){
for(int i=0; i<=a; i++){
sum = sum +i;
}
}
else{
System.out.println("not a natural number ");
}
System.out.println("the sum of n natural number is :"+sum);
}
}