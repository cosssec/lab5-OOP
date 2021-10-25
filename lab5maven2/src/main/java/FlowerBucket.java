import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public static List<FlowerPack> flowerBucketList = new ArrayList<FlowerPack>();

    public void addPack(FlowerPack flowerPack){
        flowerBucketList.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerBucketList.size(); i++) {
            price += flowerBucketList.get(i).getPrice();
        }
        return price/2;
    }
}
