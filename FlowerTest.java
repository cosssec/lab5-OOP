import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(15);
        flower.setSepalLength(4.9);
        flower.setFlowerType(FlowerType.ROSE);
    }

    @Test
    void getSepalLength() {
        assertEquals(4.9, flower.getSepalLength());
    }

    @Test
    void getPrice() {
        assertEquals(15, flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, Flower.getFlowerType());
    }

}