package com.sprintcode.ecommerce.service;

import com.sprintcode.ecommerce.dto.Purchase;
import com.sprintcode.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
