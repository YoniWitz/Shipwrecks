package com.kbsp;

import com.kbsp.controllers.HomeController;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest
{
    @Test
    public void testApp()
    {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das boot!");

       }
}
