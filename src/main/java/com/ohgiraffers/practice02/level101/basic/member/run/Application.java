package com.ohgiraffers.practice02.level101.basic.member.run;

import com.ohgiraffers.practice02.level101.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======필드 초가값 확인=====");
        System.out.println(memberDTO.getId());
        System.out.println(memberDTO.getPwd());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getPhone());
        System.out.println(memberDTO.getEmail());

        // 필드값 변경
        memberDTO.setId("user01");
        memberDTO.setPwd("pass01");
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong123@ohgiraffers.com");

        System.out.println("======변경된 필드값 확인=====");
        System.out.println(memberDTO.getId());
        System.out.println(memberDTO.getPwd());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getPhone());
        System.out.println(memberDTO.getEmail());

    }
}
