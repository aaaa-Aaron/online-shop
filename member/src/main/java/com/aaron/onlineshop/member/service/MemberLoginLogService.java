package com.aaron.onlineshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aaron.common.utils.PageUtils;
import com.aaron.onlineshop.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author aaron
 * @email 153398483@qq.com
 * @date 2021-07-26 20:30:31
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

