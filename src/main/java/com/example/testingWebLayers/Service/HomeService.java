package com.example.testingWebLayers.Service;

import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeService {
    public String getGreeting(){
        return "Home Service greeting method is called!";
    }
}
