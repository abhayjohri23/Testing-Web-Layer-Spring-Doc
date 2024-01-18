package com.example.testingWebLayers.TestController;

import com.example.testingWebLayers.Controller.HomeController;
import com.example.testingWebLayers.Service.HomeService;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(HomeController.class)
@AutoConfigureWebMvc
public class TestHomeControllerWithWebMVCTest {
    @Autowired
    public MockMvc mockMvc;
    @MockBean
    private HomeService homeService;

    @Test
    public void testIfHomeControllerReceivesRequest() throws Exception{
        when(homeService.getGreeting()).thenReturn("Home Service greeting method is called!");
        this.mockMvc.perform(get("/homeController")).andDo(print()).andExpect(status().is(200));
    }
}
