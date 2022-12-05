package hello.core.member;

import hello.core.AutoAppConfig;
import org.junit.jupiter.api.BeforeEach;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AutoAppConfig appConfig = new AutoAppConfig();
        //memberService = appConfig.memberService();
    }

}
