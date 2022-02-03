package LAB4.controllers;

import LAB4.persistence.dao.services.interfaces.CarSimpleService;
import LAB4.persistence.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarSimpleService carSimpleService;

    @GetMapping(value = "/all")
    public ModelAndView listAllCars(ModelAndView modelAndView) throws InterruptedException {
        modelAndView.addObject("car", carSimpleService.findAll());
        modelAndView.setViewName("car/cars");
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public String addNewCar(HttpServletRequest request) {
        Car car = new Car();
        car.setMark(request.getParameter("mark"));
        car.setModel(request.getParameter("model"));
        car.setEngineVolume(Float.parseFloat(request.getParameter("engineVolume")));
        car.setPrice(Float.parseFloat(request.getParameter("price")));
        car.setMaxSpeed(Integer.parseInt(request.getParameter("maxSpeed")));
        carSimpleService.addCar(car);
        return "redirect: all";
    }

    @GetMapping(value = "/findCarByMark")
    public ModelAndView findCarByMark(@RequestParam("mark") String mark, ModelAndView modelAndView) {
        modelAndView.addObject("car", carSimpleService.findCarByMark(mark));
        modelAndView.setViewName("car/search");
        return modelAndView;
    }

    @GetMapping(value = "/findCarByMarkAndModelAndMaxSpeed")
    public ModelAndView findCarByMarkAndModelAndMax_speed(@RequestParam("mark") String mark,
                                                      @RequestParam("model") String model,
                                                      @RequestParam("maxSpeed") int maxSpeed,
                                                      ModelAndView modelAndView) {
        modelAndView.addObject("car",
                carSimpleService.findCarByMarkAndModelAndMaxSpeed(mark, model, maxSpeed));
        modelAndView.setViewName("car/search");
        return modelAndView;
    }

    @GetMapping(value = "/removeById")
    public String removeById(@RequestParam("id") long id) throws InterruptedException {
        carSimpleService.removeById(id);
        return "redirect: all";
    }

    @GetMapping(value = "/removeAllByMark")
    public String removeAllByMark(@RequestParam("mark") String mark)throws InterruptedException {
        carSimpleService.removeAllByMark(mark);
        return "redirect: all";
    }

}
