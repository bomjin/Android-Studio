package com.company;

public class Exam04 {
         static int var =100; //전역 변수 : 모든 메소드에 사용된다.


    public static void main(String[] args) {
        int var = 0; //지역 변수 : 메소드 내부에서만 사용된다.
        System.out.println(var); // 0값 출력

        int sum = addFunction(10,20);
        System.out.println(sum);

    }
    static int addFunction(int num1, int num2)  {
        int hap;
        hap = num1 + num2 + var; //var 값이 전역변수에 영향을 받아 100을 출력합니다. 
        return hap;

    }
}
