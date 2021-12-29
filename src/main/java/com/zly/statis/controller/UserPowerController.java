package com.zly.statis.controller;

import com.zly.statis.entity.R;
import com.zly.statis.pojo.MpcApprove;
import com.zly.statis.service.ApproveService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 张
 * 权限相关的控制类
 */
@RestController
@RequestMapping("/power/user")
public class PowerController {

    @Autowired
    ApproveService approveService;

    @ApiOperation(value = "查看自己申请审批流程数据",httpMethod = "GET")
    @GetMapping("/queryApprove")
    R queryApprove(@RequestParam("job_id") String job_id){
        //需要处理成map后返回
//        Map<String,Object> approveMap = approveService.queryApprove(job_id);
        //这里逻辑有问题，输出多个对象的时候，需要一个一个put进去
        return R.ok().data("mpcApprove", approveService.queryApprove(job_id));
    }

    @ApiOperation(value = "提交申请，一次只能提交一条",httpMethod = "GET")
    @GetMapping("/applyPower")
    R applyPower(@RequestParam("job_id") String job_id, @RequestParam("role_id") String role_id,@RequestParam("reason") String reason){
        approveService.updateApproveService(job_id,role_id,reason);
        return R.ok();
    }




}
