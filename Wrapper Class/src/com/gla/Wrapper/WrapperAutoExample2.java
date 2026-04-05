package com.gla.Wrapper;

public class WrapperAutoExample2 {
    public void main(String[] args) {

        float a = 5.5f;
        Float obj = a;
        System.out.println("object value: " + obj);

        Float b = obj;
        System.out.println("Primitive value: " + b);
    }
}

