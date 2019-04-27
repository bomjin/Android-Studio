package com.company;

public class Car {
    String color;  //색상
    int speed = 0; //속도
    static int carCount = 0; // 정적필드, 생산된 차의 대수를 세는 데 이용가능, Car,CarCount 형식을 사용
    final static int MAXSPEED = 200;
    final static int MINSPEED = 0;

    static int currentCarCount() { //메소드 호출하려면 Car.currentCarCount()향식 사용
        return carCount;
    }

    Car(String color, int speed) {
        this.color = color;    //this는 자기자신을 의미
        this.speed = speed;
        carCount ++; //인스턴스가 생성되면  정적 필드인 carCOunt 한대 씩 증가
   }
   Car(int speed) {
        this.speed = speed;  // 메소드 오버로딩 클래스 내에서 메소드의 이름이 같아도 파라미터의 개수나 데이터형만 다르면 여러 개를 선언할 수 있는 것을 말한다.
   }

   Car() {


   }


    int getSpeed()   {     //현재 속도를 얻는 메소드
      return speed;
    }
    void upSpeed(int value) { //추가속
        if (speed + value >= 200)
            speed = 200;
        else
            speed = speed + value;

    }
    void downSpeed(int value) {
        if (speed - value <= 0)
            speed =0;
        else speed = speed -value;

    }
    String getColor() {
        return color;
    }
}
/**
 클래스 = 변수, 메소드
 객체지향 > 클래스 > 객체가 가질 수 있는 상태와 행동
 ex ) 자동차라는 객체 클래스 = 자동차를 생성하기 위한 설계도
 설계도를 통해 여러 대의 자동차(인스턴드)를 생성한다.


 **/