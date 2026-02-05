import java.util.Scanner;
class FactorForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
int n = sc.nextInt();

if (n<=0){
System.out.println("Enter the Positive Integer: ");
}
else{
for(int i = 1 ; i <= n ; i++){
if(n % i == 0){
System.out.println(i);
}
}
}
}
}
