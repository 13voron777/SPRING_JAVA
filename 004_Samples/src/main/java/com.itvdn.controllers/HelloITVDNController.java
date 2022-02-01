package com.itvdn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloITVDNController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloITVVDN(){
        return "index";
    }

    @GetMapping(value = "/bye")
    public String bye(){
        return "bye";
    }

    @GetMapping(value = "/student")
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        return "result";
    }

    @GetMapping(value = "/path/{studentName}")
    public String getNameStudent(@PathVariable String studentName, Model model){
        model.addAttribute("studentName", studentName);
        return "student-name";
    }

}
