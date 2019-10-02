//package com.example.musicAll.Controller;
//
//import com.example.musicAll.Config.JwtUtil;
//import com.example.musicAll.Service.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(UserController.class)
//public class UserControllerSignUpTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    UserService userService;
//
//    @MockBean
//    private JwtUtil jwtUtil;
//
//    @Test
//    public void signup_Success() throws Exception{
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .post("/signup")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(createUserInJson("newUser", "abc"), RoleType[0] );
//        when(userService.createUser(any())).thenReturn("123456");
//
//        MvcResult result = mockMvc.perform(requestBuilder)
//                .andExpect(status().isOk())
//                .andExpect(content().json("{\"token\":\"123456\"}"))
//                .andReturn();
//        System.out.println(result.getResponse().getContentAsString());
//    }
//
//    private static String createUserInJson(String name,String password, String[] RoleType ){
//        return "{  \"name\": \"" + name + "\"," +
//                "\"password\": \"" + password + "\"}";
//    }
//}
