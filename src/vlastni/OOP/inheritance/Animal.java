package vlastni.OOP.inheritance;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public String name;
    public int energy;

    public void eat() {
        energy++;
    }

    public void makeNoise() {
        System.out.println("Make some noise");
    }
}

class Dog extends Animal {
    public String breed;

    @Override
    public void makeNoise() {
        System.out.println("Haf haf");
    }
}

class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Mňau");
    }
}

class Main {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.eat();
        c.name = "Betsy";
        c.makeNoise();

         Dog d = new Dog();
        d.name = "Arnold";
        d.breed = "Zlatý retriever";
        d.eat();
        d.makeNoise();
        List<Animal> animals = new ArrayList<>();
        animals.add(c);
        animals.add(d);
    }
}
