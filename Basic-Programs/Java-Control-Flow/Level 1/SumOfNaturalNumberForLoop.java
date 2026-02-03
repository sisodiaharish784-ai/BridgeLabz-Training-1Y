import java.util.Scanner;
class SumOfNaturalNumberForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number :");
int n = sc.nextInt();
int sum = 0;
for(int i = 0; i<=n; i++){
sum = sum + i;
}
int Formula = n*(n+1)/2;

if(Formula == sum) {
System.out.println("the sum of n nature number by double checking is " + sum);
}
}
}