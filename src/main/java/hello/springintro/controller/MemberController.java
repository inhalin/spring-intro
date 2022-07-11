package hello.springintro.controller;

import hello.springintro.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // DI - 생성자 주입
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

/* DI - 필드 주입
    @Autowired private MemberService memberService;
*/

/* DI - setter 주입
    private MemberService memberService;

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
*/
}
