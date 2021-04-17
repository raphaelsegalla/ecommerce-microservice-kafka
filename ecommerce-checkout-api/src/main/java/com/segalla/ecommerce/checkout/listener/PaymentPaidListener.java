package com.segalla.ecommerce.checkout.listener;

import com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent;
import com.segalla.ecommerce.checkout.entity.CheckoutEntity;
import com.segalla.ecommerce.checkout.service.CheckoutService;
import com.segalla.ecommerce.checkout.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
