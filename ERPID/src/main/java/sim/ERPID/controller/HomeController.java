package sim.ERPID.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sim.ERPID.domain.Member;
import sim.ERPID.repository.JpaMemberRepository;
import sim.ERPID.repository.MemberRepository;
import sim.ERPID.service.MemberService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

//    @GetMapping("/")
//    public String home(Model model){
//        return "index";
//    }

}
