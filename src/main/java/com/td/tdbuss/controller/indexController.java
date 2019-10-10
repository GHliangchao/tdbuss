package com.td.tdbuss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {

    @RequestMapping("/")
    public ModelAndView test() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }

}
