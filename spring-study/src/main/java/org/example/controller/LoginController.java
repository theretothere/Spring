package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    public LoginService loginService;

//    @Autowired
//    @Qualifier("user1")
//    public User user;

////    @RequestMapping("/服务路径")
//    public String login(String username, String password){
//        //请求数据校验
//        loginService.login(username, password);
//        return "前端页面路径";
//    }

    @Bean
    public User user1(){
        User user = new User();
        user.setName("战三");
        user.setPassword("123");
        return user;
    }

    @Bean
    public User user2(){
        User user = new User();
        user.setName("张三");
        user.setPassword("123");
        return user;
    }
}
