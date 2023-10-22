package oop_practice.cat_dog.animal;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.print("My name is " + name + ". ");
    }
}
