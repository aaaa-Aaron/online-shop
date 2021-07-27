package com.aaron.onlineshop.coupon.dao;

import com.aaron.onlineshop.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 20:20:43
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
