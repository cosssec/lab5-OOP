import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class Store {

    List<FlowerBucket> flowerStoreList = new ArrayList<FlowerBucket>();

    public void addBucket(FlowerBucket flowerBucket) {
        flowerStoreList.add(flowerBucket);
    }


    public FlowerBucket search(int price_bucket) {
        System.out.println(flowerStoreList);
        for (int i = 0; i < flowerStoreList.size(); i++) {
            if (flowerStoreList.get(i).getPrice() == price_bucket) {
                System.out.println();
                return flowerStoreList.get(i);
            } else {
                return null;

            }

        }
        return null;
    }
}
