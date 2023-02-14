package com.sprintcode.ecommerce.service;

import com.sprintcode.ecommerce.dto.PaymentInfo;
import com.sprintcode.ecommerce.dto.Purchase;
import com.sprintcode.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
