import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack();
        Flower flower = new Flower();
        flower.setPrice(20);
        flowerPack.setFlower(flower);
        flowerPack.setAmount(6);
    }

    @Test
    void getPrice() {
        assertEquals(120, flowerPack.getPrice());
    }
}