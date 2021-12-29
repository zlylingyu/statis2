package com.zly.statis.controller;

import com.zly.statis.entity.LoginFrom;
import com.zly.statis.entity.R;
import com.zly.statis.pojo.MpcUser;
import com.zly.statis.service.LoginService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private LoginService loginService;

    @ApiOperation("根据账号密码判断是否可以登录成功，并返回用户数据")
    @GetMapping("/doLogin")
    public R doLogin(@RequestBody LoginFrom from){
        MpcUser mpcUser = loginService.selectMpcUser(from.getJob_id());
        if(from.setPassword(getMD5(from.getPassword())).equals(mpcUser.getPassword())){
            return R.ok().data("mpcUser", mpcUser);
        }
        return R.error();
        }

}

