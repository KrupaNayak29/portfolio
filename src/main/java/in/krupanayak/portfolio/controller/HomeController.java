package in.krupanayak.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // loads index.html with all fragments
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect"; // loads redirect.html which points to /
    }
}



