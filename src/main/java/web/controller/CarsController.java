package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getAllCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
            model.addAttribute("listCars", carService.getSomeCars(count));
        return "cars";
    }

}
