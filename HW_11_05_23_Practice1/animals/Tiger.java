package animals;

public class Tiger extends Animal {


    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " rearing");
    }
}
