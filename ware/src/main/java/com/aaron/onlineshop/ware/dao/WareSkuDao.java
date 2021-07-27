package com.aaron.onlineshop.ware.dao;

import com.aaron.onlineshop.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 21:54:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
