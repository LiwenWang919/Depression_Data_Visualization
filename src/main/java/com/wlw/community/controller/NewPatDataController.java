package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewPatDataController {

    @RequestMapping(path = "/visual/newpatdata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String newpatdata(){

        JSONObject jsonObject=new JSONObject();

        String s="{\"data\":[\n" +
                "   [45, 32, 54, 23, 43, 71, 34, 45, 34, 53, 37, 64, 62, 24, 45],\n" +
                "   [82, 113, 134, 68, 97, 112, 82, 113, 134, 68, 97, 112, 68, 97, 112],\n" +
                "]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
