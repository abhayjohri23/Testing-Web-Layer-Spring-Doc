package com.example.testingWebLayers.TestController;

import com.example.testingWebLayers.Controller.HomeController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestHomeController {
    @Autowired
    private HomeController homeController;
    //Sanity Check: Pre-requisite checks for the spring application to start properly and initialise the AppContext and beans for DI.
    @Test
    @DisplayName("Application Context Loading test case")
    public void testIfTheContextApplicationLoadsOrNot(){
        return ;
    }

    @Test
    @DisplayName("Dependency Injection test for home controller")
    public void testIfBeanForHomeControllerStartsOrNot(){
        assertThat(homeController).isNotNull();
    }

}
