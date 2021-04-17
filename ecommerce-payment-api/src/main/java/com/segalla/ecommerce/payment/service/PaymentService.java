package com.segalla.ecommerce.payment.service;

import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.segalla.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
