package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyController {
    @GetMapping({"/", "/abc"})
    public String goDisplay() {
        return "convert";
    }

    @GetMapping("/calculate")
    public String convert(@RequestParam float rate, @RequestParam float usd, ModelMap modelMap) {
        float VND = rate * usd;

        modelMap.put("VND", VND);

        return "result";
    }
}

