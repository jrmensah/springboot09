package me.jerilynmensah.springboot09;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    JobRepository jobRepository;

    @RequestMapping("/")
    public String listJobs(Model model){
        model.addAttribute("jobs", jobRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String jobForm(Model model){
        model.addAttribute("job", new Job());
        return "jobform";
    }
    
}
