package com.guxingke.kblog.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gxk on 16-10-12.
 */
@Controller
@RequestMapping("/")
public class HomeTpl {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
