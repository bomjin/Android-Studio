package com.company;

public class Car_Exam {
    public static void main(String[] args) {


           Car myCar1 = new Car("빨강",0);
           Car myCar2 = new Car("파랑",0);
           Car myCar3 = new Car("초록",0);
          // Car myCar4 = new Car( "노", 0);




        /**Car myCar1 = new Car();
        myCar1.color = "빨강";
        myCar1.speed = 0;



        Car myCar2 = new Car();
        myCar1.color = "파랑";
        myCar1.speed = 0;


        Car myCar3 = new Car();
        myCar1.color = "초록";
        myCar1.speed = 0;
         **/


        myCar1.upSpeed(50);
        System.out.println("자동차1의 색상은" + myCar1.getColor()+"이며 속도는"+myCar1.getSpeed()+"km입니다." );


        myCar2.downSpeed(20);
        System.out.println("자동차2의 색상은" + myCar2.getColor()+"이며 속도는"+myCar2.getSpeed()+"km입니다." );

        myCar1.upSpeed(250);
        System.out.println("자동차3의 색상은" + myCar3.getColor()+"이며 속도는"+myCar3.getSpeed()+"km입니다." );



        System.out.println("생산된 차의 대수(정적필드) ==>"+Car.carCount);
        System.out.println("생산된 차의 대수(정적 메소드) ==>"+Car.currentCarCount());
        System.out.println("차의 최고 제한 속도 ==>"+ Car.MAXSPEED);

    }


}




