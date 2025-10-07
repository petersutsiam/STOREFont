package com.store;

public interface PaymentGateway {
    boolean charge(int amount);
}
