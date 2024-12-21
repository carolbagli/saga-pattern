package com.examples.sale.application.ports.in;

import com.examples.sale.application.core.domain.Sale;

public interface CreateSaleInputPort {
    void create(Sale sale);
}
