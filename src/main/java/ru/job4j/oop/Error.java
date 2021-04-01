package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активация: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 404, "не найдено");
        Error error2 = new Error(true, 451, "недоступно по юридическим причинам");
        Error error3 = new Error(true, 301, "перемещено навсегда");
        error.printInfo();
        System.out.println();
        error1.printInfo();
        System.out.println();
        error2.printInfo();
        System.out.println();
        error3.printInfo();
    }
}
