package com.zly.statis.utils;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginFrom {
    private String job_id;
    private String password;
}
