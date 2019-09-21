package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String greetingForm(Model model) {
        Student theStudent = new Student();
        model.addAttribute("student", theStudent);
        return "student";
    }

    @PostMapping("/student")
    public String greetingSubmit(@ModelAttribute Student student) {
        return "result";
    }

}