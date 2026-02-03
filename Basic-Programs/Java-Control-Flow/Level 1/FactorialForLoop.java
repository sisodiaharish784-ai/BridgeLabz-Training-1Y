import java.util.Scanner;
class FactorialForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number for factorial :");
int num = sc.nextInt();
int fac = 1;
for(int i=1; i<=num; i++){
fac = fac*i;
}
System.out.printf("the factorial of %d is %d", num ,fac );
}
}