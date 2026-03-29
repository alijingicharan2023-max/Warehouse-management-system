import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testStockAddition() {
        App.addStock(50);
        assertEquals(150, App.getStock());
    }

    @Test
    void testStockRemoval() {
        App.removeStock(20);
        assertEquals(130, App.getStock());
    }

    @Test
    void testNegativeStockPrevention() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.removeStock(500);
        });
    }
}