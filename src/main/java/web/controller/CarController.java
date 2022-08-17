package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("cars")
    public String getAllCars(ModelMap modelMap) {

        List<Car> cars = carService.getAllCars();

        modelMap.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/several-cars")
    public String getSeveralCars(ModelMap modelMap, @RequestParam("count") int count) {
        List<Car> cars = carService.getAllCars();

        if (count >= cars.size()) {
            modelMap.addAttribute("cars", cars);
            return "cars";
        } else {
            cars.subList(count, cars.size()).clear();
            modelMap.addAttribute("cars", cars);
            return "cars";
        }
    }
}
