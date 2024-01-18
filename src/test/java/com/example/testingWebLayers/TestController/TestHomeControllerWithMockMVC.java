package com.example.testingWebLayers.TestController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//These test cases are unit test cases and use @AutoConfigureMockMvc to start the web layer and context beneath the server.
/*However, in this test,
Spring Boot instantiates only the web layer (Controller's Web Layer) rather than the whole context.
After this controller is ready to take in the HTTP requests and response without starting the server*/

@SpringBootTest
@AutoConfigureMockMvc
public class TestHomeControllerWithMockMVC {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIfSameResponseIsGeneratedByHomeControllerOrNot() throws Exception {
        mockMvc.perform(get("/homeController")).andDo(print()).andExpect(status().is(200)).andExpect(
          content().string(containsString("Home Service greeting method is called!"))
        );
    }
}
