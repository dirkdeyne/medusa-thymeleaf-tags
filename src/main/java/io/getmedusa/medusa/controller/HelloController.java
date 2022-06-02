package io.getmedusa.medusa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    @GetMapping("/hello/{who}")
    public String hello(@PathVariable String who, Model model) {
        model.addAttribute("who", who);
        return "hello";
    }

}
