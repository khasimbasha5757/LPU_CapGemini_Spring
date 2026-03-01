package com.capgemini.Library_Management.service;


import java.lang.reflect.Member;
import java.util.List;

public interface MemberService {

    Member addMember(Member memberDetails);

    Member getMemberById(Long memberId);

    List<Member> getAllMembers();

    Member updateMember(Long memberId, Member updatedDetails);

    void deleteOrDisableMember(Long memberId);
}