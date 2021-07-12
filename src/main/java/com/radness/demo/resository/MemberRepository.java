package com.radness.demo.resository;

import com.radness.demo.domain.Member;

import java.util.*;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
