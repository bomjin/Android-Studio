package com.company;

public class Exam05 {
    static int var =100;
    public static void main(String[] args) {
        int num1 = 100 ; int num2 = 0;
        try {
            System.out.println(num1/num2);

        }catch (java.lang.ArithmeticException e) { 
 System.out.println("계산에 문제가 있습니다.");

        }

    }
}
