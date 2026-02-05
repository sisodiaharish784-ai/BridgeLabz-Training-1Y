import java.util.Scanner;
class MultipleWhileLoop {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter number: ");
int number = sc.nextInt();

if (number <= 0  || number >= 100){
System.out.println("Enter a positive number less then 100");
}
else{
int counter = number - 1;

System.out.println("Multiple (factor)" + number + "are":);

while (counter > 1){
if (number % counter == 0){
System.out.println(counter);
}
counter--;
}
}
}
}