package sim.ERPID.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErpidController {

    @GetMapping("Erpid")
    public String Erpid(Model model){
        model.addAttribute("data","Spring");
        return "Erpid";
    }
}
