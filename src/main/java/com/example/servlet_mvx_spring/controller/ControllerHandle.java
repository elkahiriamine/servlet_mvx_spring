package com.example.servlet_mvx_spring.controller;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class ControllerHandle implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String firstName = request.getParameter("fname");
        String lastName  = request.getParameter("lname");
        Map model  = new HashMap();
        model.put("msg","Hello, Mr."+lastName+" "+firstName);
        return new ModelAndView("success",model);
    }
}
