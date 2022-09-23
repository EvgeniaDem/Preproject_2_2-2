package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("cars")
    public String getAllCars(ModelMap modelMap, @RequestParam(name = "count", required = false) Integer count) {
        List<Car> cars = carService.getSeveralCars(count);
        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}
