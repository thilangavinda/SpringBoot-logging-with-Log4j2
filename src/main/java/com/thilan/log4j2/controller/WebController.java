package com.thilan.log4j2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/vi/blog")
@Controller
public class WebController {
    @RequestMapping(value = "/Dashboard")
    public String index() {
        return "index";
    }
}
