package org.example.service;

import org.example.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class LoginService {

    @Autowired
    private LoginDAO loginDAO;

//    //service：业务逻辑，根据传入，执行不同条件的dao操作
//    public void login(int id, String username, String password) {
//        if(id==1)
//            User user = loginDAO.query(username);
//        else if(id==2)
//            UserDAO.query(...);
//
//    }
}
