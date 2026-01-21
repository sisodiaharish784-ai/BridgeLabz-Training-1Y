import java.util.Scannner;
class IntOperation {
public static void main(String[]args){
Scannner sc = new Scannner(System.in);

System.out.print("Enter a:");
int a = sc.nextInt();

System.out.print("Enter b:");
int b = sc.nextInt();

System.out.print("Enter c:");
int c = sc.nextInt();

int op1 = a + b * c;
int op2 = a * b + c;
int op3 = c + a / b;
int op4 = a % b + c;

System.out.println("The result of Int Operationsare"
 + op1 +","+ op2 +","+ op3 +",and"+ op4);
 }
 }