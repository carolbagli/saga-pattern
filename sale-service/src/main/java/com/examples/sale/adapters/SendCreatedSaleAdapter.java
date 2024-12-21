package com.examples.sale.adapters;

import com.examples.sale.adapters.out.message.SaleMessage;
import com.examples.sale.application.core.domain.Sale;
import com.examples.sale.application.core.domain.enums.SaleEvent;
import com.examples.sale.application.ports.out.SendCreatedSaleOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCreatedSaleAdapter implements SendCreatedSaleOutputPort {
    @Autowired
    private KafkaTemplate<String, SaleMessage> kafkaTemplate;

    @Override
    public void send(Sale sale, SaleEvent event) {
        var saleMessage = new SaleMessage(sale,event);
        kafkaTemplate.send("tp-saga-sale", saleMessage);
    }
}
