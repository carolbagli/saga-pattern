package com.examples.sale.adapters.out.repository.mapper;

import com.examples.sale.adapters.out.repository.entity.SaleEntity;
import com.examples.sale.application.core.domain.Sale;
import com.examples.sale.application.core.domain.enums.SaleStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")

public interface SaleEntityMapper {

    @Mapping(source = "status", target = "statusId", qualifiedByName = "setStatusId")
    SaleEntity toSaleEntity(Sale sale);

    @Named("setStatusId")
    default Integer setStatusId(SaleStatus saleStatus){
        return saleStatus.getStatusId();
    }
    @Mapping (source="statusId", target = "status", qualifiedByName="setStatus")
    Sale toSale (SaleEntity saleEntity);

    @Named("setStatus")
    default SaleStatus setStatusId(Integer saleStatusId){
        return SaleStatus.toEnum(saleStatusId);
    }

}
