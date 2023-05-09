package hello.hellospring.controller;

import hello.hellospring.entity.Member;
import hello.hellospring.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class HelloController {
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private MemberService memberService;

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");

        Optional<Member> member = memberService.getMember(new Long(1));

        log.info("{}", member.get().getName());

        return "hello";
    }
}
