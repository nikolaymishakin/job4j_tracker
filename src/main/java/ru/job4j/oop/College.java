package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = (Student) freshman; // Приведение типа за счет понижения по иерархии
        Object obj = freshman; // Повышающее приведение типа
    }
}
