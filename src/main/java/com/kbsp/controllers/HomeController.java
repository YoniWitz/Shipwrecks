package com.kbsp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jhirshowitz on 6/7/2016.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public  String home()
    {
        return "Das boot!";
    }
}
