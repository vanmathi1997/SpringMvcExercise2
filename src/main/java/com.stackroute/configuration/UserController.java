package com.stackroute.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
 @RequestMapping("/login")
    public ModelAndView getPage(HttpServletRequest request, HttpServletResponse response)
 {
     String name=request.getParameter("t1");
     String password=request.getParameter("t2");
     User user=new User(name,password);
     ModelAndView view=new ModelAndView();
     view.setViewName("login");
     view.addObject("username",name);
     view.addObject("password",password);
     return view;
 }

}
