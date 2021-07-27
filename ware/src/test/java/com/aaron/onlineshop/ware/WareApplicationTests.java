package com.aaron.onlineshop.ware;

import com.aaron.onlineshop.ware.entity.WareSkuEntity;
import com.aaron.onlineshop.ware.service.WareSkuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WareApplicationTests {
    @Autowired
    WareSkuService wareSkuService;

    @Test
    void contextLoads() {
        WareSkuEntity wareSkuEntity = new WareSkuEntity();
        wareSkuEntity.setSkuName("手机");
        wareSkuService.save(wareSkuEntity);
    }

}
