package com.company;

public class CalculatorRunner {


    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(8,6));
        System.out.println(c1.multiply(5,8));
        System.out.println(c1.divide(76,9));
        System.out.println(c1.modulo(45,11));
        System.out.println(c1.sine(180));
        System.out.println(c1.cos(0));
        System.out.println(c1.tan(45));
    }

}
