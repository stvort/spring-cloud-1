package ru.otus.webapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.otus.webapp.config.AppProps;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final AppProps appProps;

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("pageTitle", appProps.getPageTitle());
        return "index";
    }
}
