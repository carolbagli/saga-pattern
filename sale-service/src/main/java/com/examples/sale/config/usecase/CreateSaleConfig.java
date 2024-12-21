package com.examples.sale.config.usecase;

import com.examples.sale.adapters.out.SaveSaleAdapter;
import com.examples.sale.application.core.usecase.CreateSaleUseCase;
import com.examples.sale.application.ports.out.SendCreatedSaleOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateSaleConfig {

    @Bean
    public CreateSaleUseCase createSaleUseCase(
            SaveSaleAdapter saveSaleAdapter,
            SendCreatedSaleOutputPort sendCreatedSaleOutputPort

    ){
        return new CreateSaleUseCase(saveSaleAdapter, sendCreatedSaleOutputPort);
    }
}
