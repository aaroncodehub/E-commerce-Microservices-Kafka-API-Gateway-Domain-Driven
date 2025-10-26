package com.pm.orderservice.kafka;

import com.pm.orderservice.customer.CustomerResponse;
import com.pm.orderservice.order.PaymentMethod;
import com.pm.orderservice.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
