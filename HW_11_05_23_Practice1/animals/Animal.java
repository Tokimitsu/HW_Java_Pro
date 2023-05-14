package animals;

public abstract class Animal {   // Абстрактный класс - контракт

    String name;

    public abstract void makeSound();   // Абстрактный метод - контракт, который должны реализовать потомки

    public void walk(){
        System.out.println(name + " is walking");
    }
}
