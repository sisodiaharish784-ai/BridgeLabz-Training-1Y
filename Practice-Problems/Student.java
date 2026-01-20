public class Student{
int id;
int age;
String name;
void displaydetails() {
String college = "ABC college";
System.out.println("ID:  " + id);
System.out.println("Age" + age);
System.out.println ("Name" + name);
System.out.println ("College" +college);
}
public static void main(String[]args) {
Student s1 = new Student();
s1.id = 101;
s1.age = 10;
s1.name = "Harish Sisodia";
s1.displaydetails();
}
}