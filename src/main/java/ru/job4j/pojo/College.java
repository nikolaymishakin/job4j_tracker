package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Мишакин Николай Викторович");
        student.setGroup(1);
        student.setDate("06.04.2021");
        System.out.println(student.getName() + " " + ", группа № " + student.getGroup()
                + ", " + student.getDate());
    }
}
