class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! 🐶");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! 🐱");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Bruno"),
                new Cat("Luna"),
                new Animal("Generic Animal")
        };

        for (Animal a : animals) {
            a.makeSound();   // polymorphism in action
        }
    }
}