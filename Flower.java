import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


@Getter @Setter
public class Flower {
    public static FlowerType flowerType;
    public double price;
    private double sepalLength;
    private int[] color;

//    public Flower(FlowerType flowerType) {
//        this.flowerType = flowerType;
//    }

    public Flower() {
        ;
    }

    public void setColor(int[] color) {

        this.color = Arrays.copyOf(color, color.length);
    }


    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public static FlowerType getFlowerType(){
        return flowerType;
    }

}
