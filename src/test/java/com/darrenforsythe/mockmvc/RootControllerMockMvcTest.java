package com.darrenforsythe.mockmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RootControllerMockMvcTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldReturnNotImplemented() throws Exception {
        //@formatter:off
        mvc.perform(
                get("/root/xyz?status={status}&comment={comment}&other={other}", "NOTOK", "COMMENT", Optional.of("Other"))
                        .characterEncoding("UTF-8")
                        .accept(MediaType.ALL)
        )
                .andExpect(
                        status().isNotImplemented()
                );
        //@formatter:on
    }
}