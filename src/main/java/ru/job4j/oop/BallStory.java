package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayac = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        kolobok.run(kolobok);
        kolobok.meeting(zayac);
        zayac.tryEat(kolobok);
        kolobok.say(zayac);
        kolobok.run(zayac);
        kolobok.meeting(wolf);
        wolf.tryEat(kolobok);
        kolobok.say(wolf);
        kolobok.run(wolf);
        kolobok.meeting(fox);
        fox.say(kolobok);
        kolobok.say(fox);
        fox.tryEat(kolobok);
        fox.finish(kolobok);
    }
}
