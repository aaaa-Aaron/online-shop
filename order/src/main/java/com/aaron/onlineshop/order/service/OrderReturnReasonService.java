package com.aaron.onlineshop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aaron.common.utils.PageUtils;
import com.aaron.onlineshop.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 21:48:37
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

