package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    // JPA 꺼 아니예요!! 상속 안받았어요!!
    List<Member> findByName(String name); // 이름은 중복 가능 > 리턴 타입 : List

    List<Member> findUser(String nameParam, Integer ageParam);

}