package com.company;

public class Automobile extends Car {

    int seatNum;

    int getSeatNum() {   //메소드
        return seatNum;

    }

    void upSpeed(int value) {  //Car 클래스의 up speed를 재정의함 = 메소드 오버라이이딩했다.
        if (speed +value >= 300)
            speed =300;
        else
            speed = speed + (int) value;

    }

}
