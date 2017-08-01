package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.controller.domain.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 01210368 on 2017/8/1.
 */
@Controller
@RequestMapping(LoginController.path)
public class LoginController {
    public static final String path = "/user";

    private Logger log = Logger.getLogger(LoginController.class);

    @RequestMapping("/login.do")
    public ModelAndView login(User user){
        log.info(JSON.toJSONString(user));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("demo/index");
        modelAndView.addObject("message","abc");
        return modelAndView;
    }
}
