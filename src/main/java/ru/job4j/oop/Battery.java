package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery energizer = new Battery(25);
        Battery duracell = new Battery(10);
        System.out.println("energizer : " + energizer.load + ". duracell : " + duracell.load);
        energizer.exchange(duracell);
        System.out.println("energizer : " + energizer.load + ". duracell : " + duracell.load);
    }
}
