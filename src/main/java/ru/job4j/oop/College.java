package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /**
         * Student student = freshman;  Повышающее приведение типа
         *         Object obj = freshman;  Повышающее приведение типа
         */
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object obj = freshman;
    }
}
