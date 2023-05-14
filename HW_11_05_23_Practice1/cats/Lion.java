package cats;

public class Lion extends Cat {

    String pride;   // Для конкретного класса создается дополнительная переменная, которая будет указывать на принадлженость льва прайду - мы расширяем функционал класса Cat

    public Lion(int paws, String beards, double weight, String name, char gender, String breed, String type, String pride) {
        super(paws, beards, weight, name, gender, breed, type);   // Ссылка на родителя. В данном случае вызывается конструктор родительского класса и ему передаются параметры
       this.pride = pride;
    }

    public Lion(double weight, String name, char gender, String breed, String type, String pride) {
       super(weight, name, gender, breed, type);
       this.pride = pride;
    }

    public void hunt(){
        System.out.println(name + " is hunting");
    }

    @Override
    public void makeSound(){              // Переопределяем метод makeSound для класса Lion
        System.out.println(name + " is rearing");
    }
}
