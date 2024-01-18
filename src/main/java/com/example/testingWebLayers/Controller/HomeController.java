package com.example.testingWebLayers.Controller;

import com.example.testingWebLayers.Service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*https://spring.io/guides/gs/testing-web/*/
@Controller
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService){
        this.homeService = homeService;
    }

    @RequestMapping("/homeController")
    public @ResponseBody String greeting(){
        return this.homeService.getGreeting();
    }
}
