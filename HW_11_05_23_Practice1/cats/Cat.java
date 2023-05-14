package cats;

public class Cat {
    int paws;
    String tail = "Has tail";                         // У всех котов есть хвост, поэтому эту переменную можно сразу инициализировать
    String beards;
    double weight;
    String name;
    char gender;
    String breed;
    String type;


    // В конструторах используется полиморфизм - перегружается метод
    public Cat(int paws, String beards, double weight, String name, char gender, String breed, String type) {
        this.paws = paws;
        this.beards = beards;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.type = type;
    }

    public Cat(double weight, String name, char gender, String breed, String type) {
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.type = type;
    }

    // Операции, которые может выполнять объект класса
    public  void jump(){
        System.out.println(name + " is jumping");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void makeSound(){
        System.out.println(name + " is meewing");
    }
}
