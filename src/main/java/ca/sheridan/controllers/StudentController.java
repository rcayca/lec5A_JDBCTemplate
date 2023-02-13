package ca.sheridan.controllers;

import ca.sheridan.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }
}

