package com.store;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void testOrderProcessedSuccessfullyWithMockPayment() {
        // Mock PaymentGateway
        PaymentGateway mockPayment = mock(PaymentGateway.class);
        when(mockPayment.charge(1000)).thenReturn(true);

        OrderService orderService = new OrderService(mockPayment);
        Product product = new Product("Laptop", 1000, 5);

        boolean result = orderService.processOrder(product, 1); // process 1 item
        assertTrue(result);
        assertEquals(4, product.getStock());
        verify(mockPayment, times(1)).charge(1000);
    }
}
