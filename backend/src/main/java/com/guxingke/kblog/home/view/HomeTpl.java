package com.guxingke.kblog.home.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeTpl {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
