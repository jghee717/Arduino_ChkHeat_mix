package sim.ERPID.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String createForm(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
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
        member.setBodyheat(form.getBodyheat());
        memberService.join(member);
        return "redirect:/members/new";
    }


    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
    @RequestMapping(value="/ins", method = RequestMethod.POST)
    public String send(@RequestParam("id1")Integer number, Model model){
        model.addAttribute("id2",number);
        model.addAttribute("msg",number);
        return "members/new";
    }
}
