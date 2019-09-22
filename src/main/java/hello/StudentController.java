package hello;

import entity.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/programmer")
    public String greetingForm(Model model) {
        Programmer programmer = new Programmer();
        model.addAttribute("programmer", programmer);
        return "form";
    }

    @PostMapping("/programmer")
    public String greetingSubmit(@ModelAttribute Programmer programmer) {
        return "result";
    }

}