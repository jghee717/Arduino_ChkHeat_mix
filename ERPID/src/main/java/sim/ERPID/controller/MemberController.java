package sim.ERPID.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sim.ERPID.domain.Member;
import sim.ERPID.service.MemberService;


import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new")
    public String createForm() {
        return "members/signup";
    }


    @PostMapping(value = "/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());
        member.setNumber(form.getNumber());
        member.setPw(form.getPw());
        member.setEmail(form.getEmail());
        member.setSex(form.getSex());
        member.setAddress(form.getAddress());
        member.setJumin(form.getJumin());
        member.setDepartment(form.getDepartment());
        member.setPosition(form.getPosition());
        member.setStatus(form.getStatus());
        member.setHire(form.getHire());
        member.setResign(form.getResign());
        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }


    @PostMapping(value = "/members/dd")
    public String create2(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());
        member.setNumber(form.getNumber());
        member.setPw(form.getPw());
        member.setEmail(form.getEmail());
        member.setSex(form.getSex());
        member.setAddress(form.getAddress());
        member.setJumin(form.getJumin());
        member.setDepartment(form.getDepartment());
        member.setPosition(form.getPosition());
        member.setStatus(form.getStatus());
        member.setHire(form.getHire());
        member.setResign(form.getResign());
        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members/dd")
    public String list2(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/dd";
    }

}
