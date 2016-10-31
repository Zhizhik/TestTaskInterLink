/**
 * Created by Zhizhinyatko on 30.10.2016.
 */
public class Main {
    public static void main (String[] args) {
        Barbie barbie = new Barbie(true, "Rubber", 33, "Blond", "Pink");
        Ken ken = new Ken (true, "Rubber", 37, 3);
        System.out.println("Is Barbie flexible? " + barbie.isFlexibility());
        System.out.println("What is Barbies material? " + barbie.getMaterial());
        System.out.println("What is Barbies height? " + barbie.getHeight());
        System.out.println("What is color of Barbies hear? " + barbie.getColorOfHear());
        System.out.println("What is color of Barbies nails? " + barbie.getColorOfNails());
        System.out.println("Is Ken flexible? " + ken.isFlexibility());
        System.out.println("What is Kens material? " + ken.getMaterial());
        System.out.println("What is Kens height? " + ken.getHeight());                  //полыморфызм
        System.out.println("What is size of Kens pipka? " + ken.getSizeOfPipka());

    }
}
