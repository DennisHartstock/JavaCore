package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }
    }

    public class Duck implements CanSwim, CanRun, CanFly {
        public void swim() {

        }

        public void run() {

        }

        public void fly() {

        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }
    }

    public class Airplane implements CanRun, CanFly {
        public void run() {

        }

        public void fly() {

        }
    }
}
