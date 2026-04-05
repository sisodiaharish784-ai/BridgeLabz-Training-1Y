package com.gla.Wrapper;
import java.util.*;


public class CollectionFrameworkPractice {
    public static void main(String[]args){
        List l = new ArrayList();
        List a = new LinkedList();
        List b = new Vector();
        List c = new Stack();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add("jay");
        l.add(7.898);
        System.out.println(l);

        ArrayList<String> al = new ArrayList<>();
        System.out.println("ArrayList: " +al);
        al.add("aa");
        al.add("bb");
        al.add("cc");
        al.add("dd");
        System.out.println(al);
        System.out.println();
    }
}
