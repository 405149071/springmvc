package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SpringMVC")

public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap mv){
        mv.addAttribute("msg", "SpringMVC");
        return "index";
    }
}
