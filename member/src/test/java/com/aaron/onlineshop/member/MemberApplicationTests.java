package com.aaron.onlineshop.member;

import com.aaron.onlineshop.member.entity.MemberEntity;
import com.aaron.onlineshop.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberApplicationTests {
    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("小伙子");
        memberEntity.setCity("中国");
        memberService.save(memberEntity);
    }

}
