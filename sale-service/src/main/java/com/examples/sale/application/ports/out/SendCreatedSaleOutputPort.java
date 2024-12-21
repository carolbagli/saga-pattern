package com.examples.sale.application.ports.out;

import com.examples.sale.application.core.domain.Sale;
import com.examples.sale.application.core.domain.enums.SaleEvent;

public interface SendCreatedSaleOutputPort {


    void send(Sale sale, SaleEvent event);
}
