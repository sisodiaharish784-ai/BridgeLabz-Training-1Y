import java.util.Scanner;
class FeetConversion {
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
double feet = sc.nextDouble();
double yard = feet / 3;
doublemiles = yards / 1760;
System.out.println("Distance in yards is" + yards +
"and in miles is " + miles);
}
}