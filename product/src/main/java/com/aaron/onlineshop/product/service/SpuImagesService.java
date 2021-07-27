package com.aaron.onlineshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aaron.common.utils.PageUtils;
import com.aaron.onlineshop.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 13:25:17
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

