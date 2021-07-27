package com.aaron.onlineshop.order.dao;

import com.aaron.onlineshop.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 21:48:37
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
