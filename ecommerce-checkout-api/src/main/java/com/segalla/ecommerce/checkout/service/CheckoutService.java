package com.segalla.ecommerce.checkout.service;

import com.segalla.ecommerce.checkout.entity.CheckoutEntity;
import com.segalla.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
