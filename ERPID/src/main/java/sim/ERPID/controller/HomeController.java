package sim.ERPID.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sim.ERPID.domain.Member;
import sim.ERPID.repository.JpaMemberRepository;
import sim.ERPID.repository.MemberRepository;
import sim.ERPID.service.HttpSessionUtils;
import sim.ERPID.service.MemberService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {
    private final MemberService memberService;
    @Autowired
    public HomeController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    @PostMapping("/")
    public String login(Integer number, String pw, HttpSession session, Model model) {

        List<Member> members = memberService.findMembers();

        if ( members == null ) {
            System.out.println("login failure");
            return "redirect:/";
        }

        // 로그인 시 password 값과 조회하려는 password 값 비교 <-- 변경
        if ( !members.stream().allMatch(member -> Boolean.parseBoolean(pw)) ) {
            System.out.println("login failure");
            return "redirect:/";
        }

        session.setAttribute(HttpSessionUtils.USER_SESSION_KEY, members); // <-- 변경
        System.out.println("login success");
        return "redirect:/";
    }

}
