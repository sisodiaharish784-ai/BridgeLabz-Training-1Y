class Demo1 {
public static void main (String[]args) {

String str = "java is easy";

StringTokenizer st = new StringTokenizer(str);

while (st.hasMoreTokens()) {
System.out.println(st.nextToken() + " ");
}
}
}