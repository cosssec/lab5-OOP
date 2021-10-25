import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FlowerPack {
    public static List<Flower> flowerPackList = new ArrayList<Flower>();

    public Flower getFlower() {

        return flower;
    }

    private Flower flower;
    private int amount;

    public double getPrice() {

        return amount * flower.getPrice();
    }

    public void setFlower(Flower flower) {

        this.flower = flower;
    }

    public void setAmount(int i) {

        this.amount = i;
    }

    public int getAmount() {
        return amount;
    }
}
