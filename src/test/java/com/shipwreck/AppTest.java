package com.shipwreck;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shipwreck.controller.HomeController;

public class AppTest 
{
    @Test
    public void testApp()
    {
    	HomeController home = new HomeController();
    	String result = home.home();
    	assertEquals(result, "Hello in Wreckship");
    }
}
