package com.aaron.onlineshop.order.dao;

import com.aaron.onlineshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 21:48:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
