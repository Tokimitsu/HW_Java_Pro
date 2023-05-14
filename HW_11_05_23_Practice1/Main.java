import institute.TelRan;

public class Main {


    public static void main(String[] args) {

        TelRan telRan = TelRan.getInstance();
        telRan.init();
        telRan.performLection();

        TelRan telRan1 =  TelRan.getInstance();
        telRan1.init();
        telRan1.performLection();

    }

}