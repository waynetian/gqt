package com.gqt.controller;  

import java.util.List;
import java.util.Iterator;   
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import com.gqt.service.UserService;  
import com.gqt.model.User;
  
@Controller  
public class UserController {  
    @Autowired  
    private UserService userService;  

    @RequestMapping("/user_register")  
    @ResponseBody
    public String register(){  
        return "user_register";  
    }  
    
    @RequestMapping("/user_login") 
    @ResponseBody
    public String login() {  
        return "user_login";
        
    }  
    /*
    @RequestMapping("/user_list") 
    public ModelAndView list() {  
        this.userService.findAll();
        mav = new ModelAndView();
        return mav;

    }  
    */

    @RequestMapping("/user_list")
    @ResponseBody
    public String list() {
        List<User> lstUser = this.userService.findAll();
        String info = "";

        for(User a : lstUser){   
           info += a.getNickName();
        } 
        return info;
    }


}  



