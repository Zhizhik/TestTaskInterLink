/**
 * Created by Zhizhinyatko on 30.10.2016.
 */
public class Barbie extends Doll {                   //наслідування
    private String colorOfHear;                     //інкапсуляція
    private String colorOfNails;


    public Barbie (boolean flex, String mater, int heigh) {
        super(flex, mater, heigh);
        this.colorOfHear = "Blond";
        this.colorOfNails = "Pink";
    }

    public Barbie (boolean flex, String mater, int heigh, String colorOfHear, String colorOfNails) {
        super(flex, mater, heigh);
        this.colorOfHear = colorOfHear;
        this.colorOfNails = colorOfNails;
    }

    public  String getColorOfHear () {
        return  colorOfHear;
    }

    public  void  setColorOfHear (String colorOfHear) {
        this.colorOfHear = colorOfHear;
    }

    public String getColorOfNails() {
        return  colorOfNails;
    }
    public  void  setColorOfNails (String colorOfNails) {
        this.colorOfNails = colorOfNails;
    }



}
