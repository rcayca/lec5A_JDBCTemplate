package ca.sheridan.controllers;

import ca.sheridan.database.DatabaseAccess;
import ca.sheridan.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private DatabaseAccess da;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("student", new Student());
//        da.insertStudent();
        return "index";
    }

    @PostMapping("/insertStudent")
    public String insertStudent(Model model, @ModelAttribute Student student) {
        da.insertStudent(student.getName());
        model.addAttribute("student", new Student());
        return "index";
    }
}

