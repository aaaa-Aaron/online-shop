package com.aaron.onlineshop.order.dao;

import com.aaron.onlineshop.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 21:48:37
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
