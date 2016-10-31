/**
 * Created by Zhizhinyatko on 30.10.2016.
 */
public class Doll {


    private boolean flexibility;                    //гнучкість ляльки
    private int height;                             //висота
    private String material;                        //матеріал


    public Doll (boolean flex, String mater, int heigh) {
            this.flexibility = flex;
            this.material = mater;
            this.height = heigh;
    }


    public Boolean isFlexibility()  {
        return  flexibility;
    }


    public void setFlexibility(boolean flexibility1) {
        this.flexibility = flexibility;
    }

    public String getMaterial() {
        return material;
    }

    public void getMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void getHeight (int height) {
        this.height = height;
    }
}
