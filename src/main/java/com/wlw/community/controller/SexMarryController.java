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

        String s="{\"offLine\":[\n" +
                "   [100, 12, 15, 17, 23, 31],\n" +
                "   [0, 25, 23, 22, 20, 18],\n" +
                "   [0, 40, 43, 42, 38, 21],\n" +
                "   [0, 28, 19, 19, 29, 30],\n" +
                "],\n" +
                "\n" +
                "\"onLine\":[\n" +
                "   [92, 14, 14, 15, 22, 25],\n" +
                "   [7, 23, 21, 22, 24, 26],\n" +
                "   [1, 36, 35, 44, 38, 23],\n" +
                "   [0, 32, 30, 19, 26, 26],\n" +
                "],\n" +
                "\n" +
                "\"offLineSum\":[100, 100, 100, 100, 100, 100],\n" +
                "\"onLineSum\":[100, 100, 100, 100, 100, 100]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
