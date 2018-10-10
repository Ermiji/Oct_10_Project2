package com.seb;

public class AnimalApp {

    public static void main(String[] args) {


        Animal a = new Animal();
        a.setAnimalName(("Smoke"));
        System.out.println(a.getAnimalName());
        System.out.println(a.eat());
        System.out.println(a.sleep());
        System.out.println(a.mythoughts());

        Cat c = new Cat();
        c.setAnimalName(("Bareto"));
        System.out.println(c.getAnimalName());
        System.out.println(c.eat());
        System.out.println(c.sleep());
        System.out.println(c.mythoughts());
        System.out.println(c.purr());

        Bird b = new Bird();
        b.setAnimalName("tweety");
        System.out.println(b.getAnimalName());
        System.out.println(b.eat());
        System.out.println(b.sleep());
        System.out.println(b.fly());


    }
}
