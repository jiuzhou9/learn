package com.demo.controller;

import com.demo.controller.domain.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 01210368 on 2017/8/1.
 */
@Controller
@RequestMapping(ToIndexController.path)
public class ToIndexController {
    public static final String path = "/";

    private Logger log = Logger.getLogger(ToIndexController.class);

    @RequestMapping("/")
    public ModelAndView toLogin(){
        log.info("go登录页");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
