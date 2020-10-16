package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.Dictionary;
import service.DictionaryImpl;

import java.util.HashMap;
import java.util.Map;

@Controller

public class DictionaryController {
    @Autowired
    private Dictionary dictionary;

    @GetMapping({"/", "/abc"})
    public String showSearchPage(){
        return "index";
    }

    @GetMapping("/search")
    public String findByKey(@RequestParam String txtSearch, ModelMap modelMap){
        String result = dictionary.findByKey(txtSearch);
        modelMap.addAttribute("result",result);
        return "result";
    }

}

