package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EastwestDataController {

    @RequestMapping(path = "/visual/eastwestdata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String eastwestdata(){

        JSONObject jsonObject=new JSONObject();

        String s="{\"data\":[" +
                "['农村', '全体', \"<span  class='colorRed'>7.0%</span>\"],\n" +
                "['农村', '东部', \"<span  class='colorRed'>6.7%</span>\"],\n" +
                "['农村', '中部', \"<span  class='colorRed'>7.5%</span>\"],\n" +
                "['农村', '西部', \"<span  class='colorRed'>6.8%</span>\"],\n" +
                "['城镇', '全体', \"<span  class='colorGrass'>6.7%</span>\"],\n" +
                "['城镇', '东部', \"<span  class='colorGrass'>6.1%</span>\"],\n" +
                "['城镇', '中部', \"<span  class='colorGrass'>6.4%</span>\"],\n" +
                "['城镇', '西部', \"<span  class='colorGrass'>7.9%</span>\"]]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
