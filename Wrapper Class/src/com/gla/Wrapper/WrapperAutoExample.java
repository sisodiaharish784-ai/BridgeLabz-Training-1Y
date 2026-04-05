package com.gla.Wrapper;

public class WrapperAutoExample {
    public void main(String[] args) {
        int a = 10;
        Integer i = a;
        //Integer i = Integer.ValueOf(a);
        System.out.println("Value: " + i);

        System.out.println("---------------------------");

        Integer b = 120;
        int m = b;
       // int m = b.intValue();
        System.out.println("Unboxing: "+m);
    }
}
