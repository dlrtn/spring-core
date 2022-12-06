package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
        OrderService orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());

        Member member = Member.builder()
                .id(1L)
                .name("memberA")
                .grade(Grade.VIP)
                .build();

        memberService.join(member);
        Order order = orderService.createOrder(member.getId(), "itemA", 10000);

        System.out.println("order = " + order);

    }

}
