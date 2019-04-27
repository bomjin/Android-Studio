package com.company;

interface iAnimal {
    abstract void eat();
}


public class Animal_Exam3 {

    public static void main(String[] args) {

        iCat cat = new iCat();
        cat.eat();

        iTiger tiger = new iTiger();
        tiger.move();
        tiger.eat();


    }

    static class iCat implements iAnimal {

        public void eat() {
            System.out.println("생선을 좋아한다.");

        }
    }

    static class iTiger extends Animal implements iAnimal {
        void move() {
            System.out.println("네발로 이동한다.");
        }


    public void eat() {
        System.out.println("멧돼지를 잡아먹는다.");
    }

}
}
