package com.company;


interface clickListener { //익명 내부 클래스
    public void print();
}
public class Exam06 {
    public static void main(String args[]) {

        clickListener listener = new clickListener() {
            @Override
            public void print() {
                System.out.println("클릭 리스너입니다.");
            }
        };
    }

}
