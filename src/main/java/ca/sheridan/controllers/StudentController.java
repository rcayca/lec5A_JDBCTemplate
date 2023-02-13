package ca.sheridan.controllers;

import ca.sheridan.database.DatabaseAccess;
import ca.sheridan.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired
    private DatabaseAccess da;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("student", new Student());
        da.insertStudent();
        return "index";
    }
}

