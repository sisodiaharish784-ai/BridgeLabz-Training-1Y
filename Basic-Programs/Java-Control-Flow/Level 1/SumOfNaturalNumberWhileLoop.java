import java.util.Scanner;
class SumOfNaturalNumberWhileLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number :");
int n = sc.nextInt();
int sum = 0;
int i = 1;
while(i<=n){
sum += i;
i++;
}
int Formula = n*(n+1)/2;

if(Formula == sum){
System.out.println("the sum of n natural number by double checking is " + sum);
}
}
}