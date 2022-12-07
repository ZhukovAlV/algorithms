package com.company;

public class Main {

    public static void main(String[] args) {
/*        Hero hero1 = new Hero();
        hero1.name = "Kirito";

        ComixHero hero2 = new ComixHero();
        hero2.name = "Batmat";*/

        AnimeHero hero3 = new AnimeHero();
        hero3.name = "Naruto";
        hero3.author = "Anybody";

        hero3.printName();
        System.out.println(hero3.author);


/*        hero1.printName();
        hero2.printName();
        hero3.printName();*/
    }
}
