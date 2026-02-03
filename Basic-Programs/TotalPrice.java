improt java.util.Scanner;
class TotalPrice {
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
double unitPrice = sc.Double();
int quantity = sc.nextInt();
double total = unitPrice * quantity;
System.out.println("The total purchase price is INR" + total + 
"if the quantity" + quantity + "and unit price is IRN" + unitPrice);
}
}