package com.gqt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
public class WelcomeController{
 
    @RequestMapping("/test1.do")
    public ModelAndView getInfo() {
        //ModelAndView mav = new ModelAndView("welcome");
        //String a = "HelloWorld";
        //model.addAttribute("msg", a);

        //model.addAttribute("msg", a);
        //return mav;//"welcome"; 
        return new ModelAndView("welcome", "msg", "Hello World");
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() throws Exception {
        return "Everything is OK";
    }

    @RequestMapping("/")
    @ResponseBody
    public String test2() throws Exception {
        return "Index";
    }






}

