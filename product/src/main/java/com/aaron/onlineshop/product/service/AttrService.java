package com.aaron.onlineshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aaron.common.utils.PageUtils;
import com.aaron.onlineshop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 13:25:17
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

