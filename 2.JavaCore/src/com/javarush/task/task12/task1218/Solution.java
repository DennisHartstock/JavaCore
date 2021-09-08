package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanEat, CanMove {
        public void eat() {

        }

        public void move() {

        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        public void move() {

        }

        public void eat() {

        }

        public void fly() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move() {

        }

        public void fly() {

        }
    }
}
