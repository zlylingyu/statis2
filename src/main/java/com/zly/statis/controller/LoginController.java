package com.zly.statis.controller;

import com.zly.statis.utils.LoginFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.zly.statis.utils.MD5Utils.getMD5;

/**
 * 登录
 */
@RestController
@RequestMapping("login")
public class LoginController {


    @RequestMapping("/doLogin")
    public String doLogin(@RequestBody LoginFrom from){
        from.setPassword(getMD5(from.getPassword()));

        return "访问成功";
    }




}
