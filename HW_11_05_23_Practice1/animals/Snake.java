package animals;

public class Snake extends Animal{

    public Snake(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " шипит");
    }

    @Override
    public void walk(){
        System.out.println(name + " is crawling");
    }


}
