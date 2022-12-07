package com.company;

public class ComixHero extends Hero {
    int power;
    public ComixHero() {
       // super();
        power = 50;
    }

    @Override
    void printName() {
        System.out.println(name + " - герой из Комикса");
    }
}
