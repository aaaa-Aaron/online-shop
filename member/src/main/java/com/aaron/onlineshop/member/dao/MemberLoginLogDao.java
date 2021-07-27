package com.aaron.onlineshop.member.dao;

import com.aaron.onlineshop.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 20:30:31
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
