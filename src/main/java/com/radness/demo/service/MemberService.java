package com.radness.demo.service;

import com.radness.demo.domain.Member;
import com.radness.demo.resository.MemberRepository;
import com.radness.demo.resository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;

    // 회원 리포지토리 코드가 회원 서비스 코드를 DI 하게 변경.
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public Long join(Member member) {
        // 중복 회원 체크
        validateDuplicationMember(member);
        // 회원 저장
        memberRepository.save(member);

        return member.getId();
    }

    // 중복 회원 확인
    private void validateDuplicationMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(member1 -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
