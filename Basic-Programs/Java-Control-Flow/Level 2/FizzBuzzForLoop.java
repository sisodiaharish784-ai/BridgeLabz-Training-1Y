import java.util.Scanner;
class FizzBuzzForLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();

if(n<=0){
System.out.println("Please Enter the positive integer");
}
else{
for(int i=1; i<=n; i++){
if (i % 3 == 0 && i % 5 == 0){
System.out.println("Enter FizzBuzz");
}
else if (i % 3 == 0){
System.out.println("Fizz");
}
else if (i % 5 == 0) {
System.out.println("Buzz");
}
else{
System.out.println(i);
}
}
}
}
}