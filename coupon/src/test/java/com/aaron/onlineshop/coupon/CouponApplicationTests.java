package com.aaron.onlineshop.coupon;

import com.aaron.onlineshop.coupon.entity.CouponEntity;
import com.aaron.onlineshop.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CouponApplicationTests {
    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setNum(1000);

        couponService.save(couponEntity);
    }

}
