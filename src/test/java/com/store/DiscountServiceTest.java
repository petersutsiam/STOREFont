package com.store;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountServiceTest {

    @Test
    void testOrderPriceAfterDiscountWithStub() {
        // Stub: a simple discount service
        DiscountService stubDiscount = new DiscountService() {
            @Override
            public int getDiscountPercent(Product product) {
                return 10; // always 10% discount
            }
        };

        Product product = new Product("Laptop", 1000, 5);
        int discountedPrice = stubDiscount.applyDiscount(product);
        assertEquals(900, discountedPrice);
    }
}
