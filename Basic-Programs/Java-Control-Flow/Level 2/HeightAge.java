import java.util.Scanner;
class HeightAge {
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Age of Aman: ");
int AmanAge = sc.nextInt();
System.out.println("Enter the Age of Ram: ");
int RamAge = sc.nextInt();
System.out.println("Enter the Age of Om: ");
int OmAge = sc.nextInt();

System.out.println("Enter the Height of Aman: ");
int AmanHeight = sc.nextInt();
System.out.println("Enter the Height of Ram: ");
int RamHeight = sc.nextInt();
System.out.println("Enter the Height of Om: ");
int OmHeight = sc.nextInt();

if (AmanAge<=RamAge && AmanAge<=OmAge){
System.out.println("Youngest Friend Aman");
}
else if (RamAge<=AmanAge && RamAge<=OmAge){
System.out.println("Youngest Friend Ram");
}
else{
System.out.println("Youngest Friend Om");
}

if (AmanHeight>=RamHeight && AmanHeight>=OmHeight){
System.out.println("Tallest Friend Aman");
}
else if (RamHeight>=AmanHeight && RamHeight>=OmHeight){
System.out.println("Tallest Friend Ram");
}
else{
System.out.println("Tallest Friend Om");
}
}
}