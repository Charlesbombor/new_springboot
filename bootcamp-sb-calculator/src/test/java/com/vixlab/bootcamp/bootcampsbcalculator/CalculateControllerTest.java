package com.vixlab.bootcamp.bootcampsbcalculator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.vixlab.bootcamp.bootcampsbcalculator.Service.CalculateService;
import com.vixlab.bootcamp.bootcampsbcalculator.controller.Impl.CalculateController;
import com.vixlab.bootcamp.bootcampsbcalculator.result.Result;

@WebMvcTest(CalculateController.class)
class CalculateControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CalculateService calculateService;


  @Test
  void operation()  throws Exception {
      Result mockReturnResult = new Result("1", "3.0", "add", "4.0");

  
      Mockito.when(calculateService.operation("1", 3, "add")).thenReturn(mockReturnResult.toString());


      mockMvc.perform(get("/api/v1/x/{x}/y/{y}/operation/{operation}", "1", 3.0, "add"))
              .andExpect(status().isOk())
              .andExpect(content().contentType(MediaType.APPLICATION_JSON))
              .andExpect(jsonPath("$.x").value("1"))
              .andExpect(jsonPath("$.y").value(3.0))
              .andExpect(jsonPath("$.operation").value("add"))
              .andExpect(jsonPath("$.result").value("4.0"))
              .andDo(print());
  }

}
