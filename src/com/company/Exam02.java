package com.company;

public class Exam02 {


    public static void main(String[] args) {


        int count = 85;
        if (count >= 95) {

        }else if (count >= 60) {
            System.out.println("합격");

        }else {
            System.out.println("불합격");
        }

    int jumsu = (count / 10)* 10; // int 형이므로 자리수 삭제 8.5면 0.5는 삭제
        switch (jumsu) {
            case 100:
            case 90:
                System.out.println("switch문 : 합격(장학생)");
                break;
            case 80:
            case 70:
            case 60:
                System.out.println("switch문 : 합격");
                break;
                default:
                    System.out.println("switch문 : 불합격");
        }

    }
}
