package com.zly.statis.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginFrom {
    private long job_id;
    private String password;
}
