package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class CarController {
    @Autowired
    CarServiceClass carService;

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String carsGet(ModelMap model, @RequestParam(value = "locale", required = false, defaultValue = "en") String locale) {
        if (locale.equalsIgnoreCase("ru")){
            model.addAttribute("locale", "МАШИНЫ");
        } else if(locale.equalsIgnoreCase("en")) {
            model.addAttribute("locale", "CARS");
        } else {
            model.addAttribute("locale", "unknown");
        }
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }
}
