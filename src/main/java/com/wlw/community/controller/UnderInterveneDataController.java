package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnderInterveneDataController {

    @RequestMapping(path = "/visual/underInterveneata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String eastwestdata(){

        JSONObject jsonObject=new JSONObject();

        String s="{category: [\n" +
                "          \"安徽\",\"河北\",\"山西\",\"辽宁\",\" 吉林\",\"黑龙江\",\"江苏\",\"浙江\",\"福建\",\"江西\",\"山东\",\"河南省\",\"湖北\",\"湖南\",\"广东\",\"海南\",\"四川\",\"贵州\",\"云南\",\"陕西\",\"甘肃\",\"青海\",\"台湾\",\"北京\",\"天津\",\"上海\",\"重庆\",\"香港\",\"澳门\"\n" +
                "        ],\n" +
                "        lineData: [\n" +
                "          18092,\n" +
                "          20728,\n" +
                "          24045,\n" +
                "          28348,\n" +
                "          32808,\n" +
                "          36097,\n" +
                "          39867,\n" +
                "          44715,\n" +
                "          48444,\n" +
                "          50415,\n" +
                "          56061,\n" +
                "          62677,\n" +
                "          59521,\n" +
                "          67560,\n" +
                "          18092,\n" +
                "          20728,\n" +
                "          24045,\n" +
                "          28348,\n" +
                "          32808,\n" +
                "          36097,\n" +
                "          39867,\n" +
                "          44715,\n" +
                "          48444,\n" +
                "          50415,\n" +
                "          36097,\n" +
                "          39867,\n" +
                "          44715,\n" +
                "          48444,\n" +
                "          50415,\n" +
                "        ],\n" +
                "        barData: [\n" +
                "          10600,\n" +
                "          11000,\n" +
                "          11500,\n" +
                "          12500,\n" +
                "          13500,\n" +
                "          14500,\n" +
                "          15900,\n" +
                "          18500,\n" +
                "          20000,\n" +
                "          27500,\n" +
                "          29200,\n" +
                "          30450,\n" +
                "          31250,\n" +
                "          39300,\n" +
                "          10600,\n" +
                "          11000,\n" +
                "          11500,\n" +
                "          12500,\n" +
                "          13500,\n" +
                "          14500,\n" +
                "          15900,\n" +
                "          28500,\n" +
                "          20000,\n" +
                "          27500,\n" +
                "          14500,\n" +
                "          15900,\n" +
                "          18500,\n" +
                "          20000,\n" +
                "          27500,\n" +
                "        ]" +
                "}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
