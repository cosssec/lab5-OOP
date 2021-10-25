import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private FlowerBucket flowerBucket_1;
    private FlowerBucket flowerBucket_2;
    private FlowerPack flowerPack_1;
    private FlowerPack flowerPack_2;
    private FlowerPack flowerPack_3;
    Store flowerStoreList_1;

    @BeforeEach
    void setUp() {
        flowerPack_1 = new FlowerPack();
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        flower.setSepalLength(7.9);

        flowerPack_1.setFlower(flower);
        flowerPack_1.setAmount(6);

        flowerPack_2 = new FlowerPack();
        Flower flower2 = new Flower();
        flower2.setFlowerType(FlowerType.TULIP);
        flower2.setPrice(15);
        flower2.setSepalLength(6.3);

        flowerPack_2.setFlower(flower2);
        flowerPack_2.setAmount(10);

        flowerPack_3 = new FlowerPack();
        Flower flower3 = new Flower();
        flower3.setFlowerType(FlowerType.ROSE);
        flower3.setPrice(12);
        flower3.setSepalLength(4.3);

        flowerPack_3.setFlower(flower3);
        flowerPack_3.setAmount(15);

        flowerBucket_1 = new FlowerBucket();
        flowerBucket_1.flowerBucketList.add(flowerPack_1);
        flowerBucket_1.flowerBucketList.add(flowerPack_2);

        flowerBucket_2 = new FlowerBucket();
        flowerBucket_2.flowerBucketList.add(flowerPack_3);

        Store flowerStoreList_1 = new Store();


        flowerStoreList_1.addBucket(flowerBucket_1);
        flowerStoreList_1.addBucket(flowerBucket_2);

    }

    @Test
    void search() {
        assertEquals(null, flowerStoreList_1.search(16089));
    }
}
