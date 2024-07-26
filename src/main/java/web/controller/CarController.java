package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

@Controller
@RequestMapping
public class CarController {

    private final CarService carService;
    public CarController (CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String getTableCars(ModelMap modelCars) {
        modelCars.addAttribute("cars", carService.carsCount(0));
        return "cars";
    }
}
