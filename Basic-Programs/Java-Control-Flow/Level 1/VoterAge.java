import java.util.Scanner;
class VoterAge {
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age");
int age = sc.nextInt();
if (age>=18){
System.out.println("the person age is" + age + "and can vote.");
}
else{
System.out.println("the person age is" + age + "cannot vote." );
}
}
 }