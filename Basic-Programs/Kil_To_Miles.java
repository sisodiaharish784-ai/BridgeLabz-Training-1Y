import java.util.Scanner;
public class Kil_To_Miles {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Kilometer=");
int Kilometer = sc.nextInt();
double miles = Kilometer*0.621371;
System.out.println(miles);
}
}