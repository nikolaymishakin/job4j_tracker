package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstname("Николай");
        student.setLastname("Мишакин");
        student.setSecondname("Викторович");
        student.setGroup(1);
        System.out.println(student.getLastname() + " " + student.getFirstname() + " " + student.getSecondname()
        + ", группа № " + student.getGroup());
    }
}
