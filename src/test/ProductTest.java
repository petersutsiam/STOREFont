import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductCreation() {
        Product product = new Product("Laptop", 1000);
        assertNotNull(product);
        assertEquals("Laptop", product.getName());
        assertEquals(1000, product.getPrice());
    }

    @Test
    void testProductDiscount() {
        Product product = new Product("Laptop", 1000);
        product.applyDiscount(10);
        assertEquals(900, product.getPrice());
    }

    @Test
    void testProductStock() {
        Product product = new Product("Laptop", 1000);
        product.addStock(50);
        assertEquals(50, product.getStock());
    }
}
