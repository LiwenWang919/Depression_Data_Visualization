package com.wlw.community.controller;


import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSONObject;
import com.wlw.community.util.CommunityConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class SexMarryController implements CommunityConstant {

    @RequestMapping(path = "/visual/sexmarry",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String VisualData(){

        JSONObject jsonObject=new JSONObject();

        String s="{}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
