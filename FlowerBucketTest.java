import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket FlowerBucket;
    private FlowerPack flowerPack_1;
    private FlowerPack flowerPack_2;

    @BeforeEach
    void setUp() {
        FlowerBucket = new FlowerBucket();

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


        FlowerBucket.addPack(flowerPack_1);
        FlowerBucket.addPack(flowerPack_2);


    }

    @Test
    void getPrice() {
        assertEquals(270, FlowerBucket.getPrice());
    }

    @Test
    void addFlowerPack() {
        assertEquals(2, FlowerBucket.flowerBucketList.size());
    }
}
