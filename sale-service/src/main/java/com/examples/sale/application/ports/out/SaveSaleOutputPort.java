package com.examples.sale.application.ports.out;


import com.examples.sale.application.core.domain.Sale;

public interface SaveSaleOutputPort {
    Sale save(Sale sale);
}
