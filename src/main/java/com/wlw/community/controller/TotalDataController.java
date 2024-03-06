package com.wlw.community.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TotalDataController {

    @RequestMapping(path = "/visual/totaldata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String totaldata(){
        JSONObject jsonObject=new JSONObject();


        String s="{\"data\":[\n" +
                "   [6.8,98157822],\n" +
                "]}";


        jsonObject= JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
