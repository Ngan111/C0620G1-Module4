package controller.service;

import org.springframework.stereotype.Service;

@Service
public class SandwichImpl implements Sandwich {

    @Override
    public String save(String condiment) {
        if (condiment.equals("")) {
            return "No choice";
        } else {
            return "Your condiment: "+condiment;
        }
    }
}
