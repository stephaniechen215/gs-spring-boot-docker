package hello;

import entity.Student2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String greetingForm(Model model) {
        Student2 theStudent = new Student2();
        model.addAttribute("student", theStudent);
        return "student";
    }

    @PostMapping("/student")
    public String greetingSubmit(@ModelAttribute Student2 student) {
        return "result";
    }

}