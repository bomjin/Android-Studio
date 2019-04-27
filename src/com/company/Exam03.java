package com.company;

public class Exam03 {
    public static void main(String[] args) {

        int one[] = new int[3];
        for(int i=0; i < one.length; i++) {  //one.length one의 배열의 크기
            one[i] = 10*i;

        }
        String two[] = {"하나", "둘", "셋"}; //two 배열 선언
        for(String str : two) {
            System.out.println(str);
        }

        int j=0; //j를 선언하고 0으로 초기화함
        while(j < one.length) {
            System.out.println(one[j]);
            j++;
        }



    }
}

