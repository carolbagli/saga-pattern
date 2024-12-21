package com.examples.sale.adapters.in.controller.mapper;

import com.examples.sale.adapters.in.controller.request.SaleRequest;
import com.examples.sale.application.core.domain.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleRequestMapper {

    Sale toSale(SaleRequest saleRequest);

}
