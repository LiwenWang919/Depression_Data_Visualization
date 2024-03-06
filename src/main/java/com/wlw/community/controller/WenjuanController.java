package com.wlw.community.controller;


import com.alibaba.fastjson.JSONObject;
import com.wlw.community.util.MailClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class WenjuanController {

    @Autowired
    private MailClient mailClient;

    @RequestMapping(path = "/data/wenjuandata",method = RequestMethod.POST)
    @ResponseBody
    public String getMap(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam.toString());
        String mail = jsonParam.getString("q1");
        int score=(int) (Math.random() * 100);
        String message;
        if(score<25){
            message = ",心理较为健康，请继续开心哦";
        }
        else if(score<50&&score>=25){
            message = ",属于中危险人群，建议前往附近医院就诊并接受专业测试";
        }
        else if(score>=50&&score<75){
            message = ",属于较高危险人群，建议前往附近医院就诊并接受专业测试";
        }
        else{
            message = ",属于高危险人群，建议前往附近医院就诊并接受专业测试";
        }
        mailClient.sendMail(mail,"您的抑郁症测试问卷报告","您的测试分数为"+score+message);
        return "{\"success\":0}";
    }


}
