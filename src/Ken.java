/**
 * Created by Zhizhinyatko on 31.10.2016.
 */
public class Ken extends Doll {

    private int sizeOfPipka;


    public Ken (boolean flex, String mater, int heigh) {
        super(flex, mater, heigh);
        this.sizeOfPipka = 3;
    }

    public Ken (boolean flex, String mater, int heigh, int sizeOfPipka) {
        super(flex, mater, heigh);
       this.sizeOfPipka = sizeOfPipka;
    }

    public  int getSizeOfPipka () {
        return  sizeOfPipka;
    }

    public  void  setSizeOfPipka (int sizeOfPipka) {
        this.sizeOfPipka = sizeOfPipka;
    }


}
