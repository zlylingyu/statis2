package com.zly.statis.service;

import com.zly.statis.entity.LoginFrom;
import com.zly.statis.pojo.MpcUser;

public interface LoginService {
    MpcUser selectMpcUser(long user_id);
}
