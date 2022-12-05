package hello.core;

import hello.core.member.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class MemberApp {

    public static void main(String[] args) {

        Member member = Member.builder()
                .id(1L)
                .grade(Grade.VIP)
                .name("memberA").build();

        MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }

}
