
package com.store;

public class DiscountService {
    public int getDiscountPercent(Product product) {
        return 0;
    }
    public int applyDiscount(Product product) {
        int discount = getDiscountPercent(product);
        return product.getPrice() * (100 - discount) / 100;
    }
}
