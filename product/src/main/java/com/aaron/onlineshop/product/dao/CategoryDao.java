package com.aaron.onlineshop.product.dao;

import com.aaron.onlineshop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 13:25:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
