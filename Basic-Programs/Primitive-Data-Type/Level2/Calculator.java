import java.util.Scanner;
class Calculator{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter number1:");
double number1 = sc.nextDouble();

System.out.println("Enter number2:");
double number2 = sc.nextDouble();

double add = number1 + number2;
double sub = number1 - number2;
double mul = number1 * number2;
double div = number1 / number2;
System.out.println("The addition,
 subtraction, multiplication, division 
 value of 2 number"
 + number1 + "and" + number2 + "is"
 + add + "," + "+sub+","+mul+",and"+ div);
 }
 }