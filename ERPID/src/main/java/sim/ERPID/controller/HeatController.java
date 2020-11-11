//package sim.ERPID.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import sim.ERPID.domain.Heat;
//import sim.ERPID.domain.Member;
//import sim.ERPID.service.HeatService;
//import sim.ERPID.service.MemberService;
//
//
//import java.util.List;
//public class HeatController {
//    private final HeatService heatService;
//
//    @Autowired
//    public HeatController(HeatService heatService) {
//        this.heatService = heatService;
//    }
//
////    @GetMapping(value = "/heats/new2")
////    public String createForm(Model model) {
////        List<Heat> heats = heatService.findHeats();
////        model.addAttribute("heats", heats);
////        return "heats/signup2";
////    }
//
////
////    @PostMapping(value = "/heats/new2")
////    public String create(HeatForm form) {
////        Heat heat = new Heat();
////        heat.setName(form.getName());
////        heat.setNumber(form.getNumber());
////        heat.setBodyheat(form.getBodyheat());
////        heatService.join(heat);
////        return "redirect:/members/new2";
////    }
////
////
////    @GetMapping("/members2")
////    public String list(Model model) {
////        List<Heat> heats = heatService.findHeats();
////        model.addAttribute("heats", heats);
////        return "members/memberList2";
////    }
//}
