
package com.store;

public class OrderService {
    private final PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processOrder(Product product, int quantity) {
        if (product.getStock() < quantity) return false;
        boolean paid = paymentGateway.charge(product.getPrice() * quantity);
        if (paid) {
            product.reduceStock(quantity);
            return true;
        }
        return false;
    }
}
