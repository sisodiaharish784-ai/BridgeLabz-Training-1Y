import java.util.Scanner;
class EmployeeBonus {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter employee salary: ");
double salary = sc.nextDouble();

System.out.println("Enter year of service: ");
double year =  sc.nextDouble();

if(year > 5){
double bouns = salary*0.05;
System.out.println("Bonus amount: " + bouns);
}
}
}