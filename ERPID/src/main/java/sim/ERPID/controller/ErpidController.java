package sim.ERPID.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErpidController {

    @GetMapping("Erpid")
    public String Erpid(Model model){
        model.addAttribute("data","Spring");
        return "Erpid";
    }

    static class Hello{
        private String name;


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

}
