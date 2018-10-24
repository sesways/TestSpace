/**
 * @Project Name:auartz
 * @Package Name:com.zx.controller
 */
package com.zx.controller;

import com.zx.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/10/24 20:47
 */
@Controller
@RequestMapping("/hello")
public class Heool {
    @Autowired
    private Student student;

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Hello");
        System.out.println(new Date() + ":" + student);
        return modelAndView;
    }
}
