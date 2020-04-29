package pl.bykowski.homework7_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.bykowski.homework7_1.db.CarDAO;
import pl.bykowski.homework7_1.model.Car;
import pl.bykowski.homework7_1.model.SearchParam;


@Controller
public class CarController {

    CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("addCar", new Car());
        model.addAttribute("serachParam" , new SearchParam());
        return "index";
    }

    @PostMapping("/car")
    public String addCar(@ModelAttribute Car newCar){
        carDAO.addCar(newCar);
        return "redirect:/";
    }

    @PostMapping("/findCars")
    public String searchCars(Model model,@ModelAttribute SearchParam searchParam)
    {
        model.addAttribute("cars", carDAO.getCarsByDate(searchParam));
        return "showCarsList";
    }

}
