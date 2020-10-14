package controller;

import controller.service.Sandwich;
import controller.service.SandwichImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @Autowired
    private Sandwich sandwich;

    @GetMapping({"/", "/abc"})
    public String goDisplay() {
        return "index";
    }
    @GetMapping("/choose")
    public String choose(@RequestParam String condiment, ModelMap modelMap) {
        String result = sandwich.save(condiment);
        modelMap.addAttribute("result", result);
        return "result";
    }
}
