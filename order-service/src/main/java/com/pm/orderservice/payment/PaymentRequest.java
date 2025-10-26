package com.pm.orderservice.payment;

import com.pm.orderservice.customer.CustomerResponse;
import com.pm.orderservice.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
