package com.uay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author audovychenko
 * @since 21.04.14
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String homeMethod(Model model) {
        model.addAttribute("text", "Hello World - Text");
        return "index";
    }

}
