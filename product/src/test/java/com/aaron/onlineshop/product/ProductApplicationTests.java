package com.aaron.onlineshop.product;

import com.aaron.onlineshop.product.entity.BrandEntity;
import com.aaron.onlineshop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("真的是华为");
        brandEntity.setName("华为");

        brandService.save(brandEntity);
    }


}
