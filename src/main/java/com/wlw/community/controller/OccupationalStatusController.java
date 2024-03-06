package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.wlw.community.service.ComdataService;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OccupationalStatusController {

    @Autowired
    private ComdataService comdataService;

    @RequestMapping(path = "/visual/Occupationalstatus",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String Occupationalstatus(){

        JSONObject jsonObject=new JSONObject();

        List num = new ArrayList<Integer>();
        List nforall = new ArrayList<Integer>();
        List data = new ArrayList<Double>();


        num.add(comdataService.query3("Working statust","Working","").getNum());
        num.add(comdataService.query3("Working statust","Student","").getNum());
        num.add(comdataService.query3("Working statust","Homemaker","").getNum());
        num.add(comdataService.query3("Working statust","Retired","").getNum());
        num.add(comdataService.query3("Working statust","Unemployed","").getNum());

        nforall.add(comdataService.query3("Working statust","Working","").getNforall());
        nforall.add(comdataService.query3("Working statust","Student","").getNforall());
        nforall.add(comdataService.query3("Working statust","Homemaker","").getNforall());
        nforall.add(comdataService.query3("Working statust","Retired","").getNforall());
        nforall.add(comdataService.query3("Working statust","Unemployed","").getNforall());

        data.add(comdataService.query3("Working statust","Working","").getUnweightedforall());
        data.add(comdataService.query3("Working statust","Student","").getUnweightedforall());
        data.add(comdataService.query3("Working statust","Homemaker","").getUnweightedforall());
        data.add(comdataService.query3("Working statust","Retired","").getUnweightedforall());
        data.add(comdataService.query3("Working statust","Unemployed","").getUnweightedforall());
        data.add(8.6);

        String s="{\"data\":[\n" +
                "   [\'就职中\', \'学生\', \'家庭劳动者\', \'退休\', \'无业\','特殊职业'],\n" +
                data+",\n" +
                "]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
