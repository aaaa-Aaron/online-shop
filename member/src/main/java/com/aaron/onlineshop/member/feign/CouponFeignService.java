package com.aaron.onlineshop.member.feign;

import com.aaron.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);

    @GetMapping("coupon/coupon/test")
    public R test2();
}
