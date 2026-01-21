class PensDistribution {
public static void main(String[]args){
int pens = 14;
int student = 3;
int perStudent = pens / student;
int remaining = pens % student;

System.out.println("The pen per Student is" + perStudent +
"and the remaining pen not distributed is"
+ remaining);
}
}