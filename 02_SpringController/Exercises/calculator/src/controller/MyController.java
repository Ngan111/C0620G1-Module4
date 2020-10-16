package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @GetMapping({"/", "/abc"})
    public String goDisplay() {
        return "index";
    }
    @PostMapping("/cal")
    public String cal(@RequestParam String val1, @RequestParam String val2, @RequestParam String operator, ModelMap modelMap) {
        double res=0;
        switch (operator) {
            case "+":
                res= Double.parseDouble(val1) + Double.parseDouble(val2);
                break;
            case "-":
                res= Double.parseDouble(val1) - Double.parseDouble(val2);
                break;
            case "*":
                res= Double.parseDouble(val1) * Double.parseDouble(val2);
                break;
            case "/":
                res= Double.parseDouble(val1) / Double.parseDouble(val2);
                break;
        }
            modelMap.put("res",res);
            return "result";
    }
}