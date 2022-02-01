package LAB3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RunController {

    @GetMapping(value = "/car")
    public ModelAndView car() {
        return new ModelAndView("LAB3/car", "command", new Car());
    }

    @PostMapping(value = "/addCar")
    public String addCar(@ModelAttribute("SpringWeb")Car car, ModelMap model) {
        model.addAttribute("id", car.getId());
        model.addAttribute("model", car.getModel());
        model.addAttribute("color", car.getColor());
        return "LAB3/result";
    }
}
