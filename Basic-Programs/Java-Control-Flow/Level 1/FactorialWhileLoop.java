import java.util.Scanner;
class FactorialWhileLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number to find factorial :");
int num = sc.nextInt();
int fac = 1;
int i = 1;
while(i<=num){
fac = fac*i;
i++;
}
System.out.printf("the factorial of %d is %d" , num , fac);
}
}