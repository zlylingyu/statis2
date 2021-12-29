package com.zly.statis.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回结果的一个类
 */
@Data

public class R {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据，以key：value形式存放")
    private Map<String,Object> data = new HashMap<String, Object>();


    //成功方法
    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setMessage("成功");
        r.setCode(200);
        return r;
    }


    //失败方法
    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setMessage("失败");
        r.setCode(400);
        return r;
    }


    //赋值是否成功
    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }


    //赋值返回信息
    public R message(String message){
        this.setMessage(message);
        return this;
    }


    //赋值返回代码
    public R code(Integer code){
        this.setCode(code);
        return this;
    }

    //

    /**
     * 赋数据进去(以key：value形式)
     * @param key
     * @param value
     * @return
     */
    public R data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public R data(Map<String,Object> map){
        this.setData(map);
        return this;
    }


}
