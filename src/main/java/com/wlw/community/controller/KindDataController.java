package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.wlw.community.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KindDataController {

    @Autowired
    private MetaService metaService;

    @RequestMapping(path = "/visual/kinddata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String kinddata(){

        JSONObject jsonObject=new JSONObject();


        List num = new ArrayList<Integer>();
        List proportion = new ArrayList<Double>();
        num.add(metaService.query3("Anxiety disorders","Any anxiety disorder","").getNforall());
        num.add(metaService.query3("Mood disorders","Any mood disorder","").getNforall());
        num.add(metaService.query3("Substance-use disorders","Any substance use disorder","").getNforall());
        num.add(metaService.query3("Impulse-control disorders","Any impulse-control disorder","").getNforall());
        num.add(metaService.query3("Eating disorders","Any eating disorder","").getNforall());
        num.add(metaService.query3("Schizophrenia and other psychotic disorders","Schizophrenia or any other psychotic disorder","").getNforall());

        proportion.add(metaService.query3("Anxiety disorders","Any anxiety disorder","").getWeightedfor12());
        proportion.add(metaService.query3("Mood disorders","Any mood disorder","").getWeightedfor12());
        proportion.add(metaService.query3("Substance-use disorders","Any substance use disorder","").getWeightedfor12());
        proportion.add(metaService.query3("Impulse-control disorders","Any impulse-control disorder","").getWeightedfor12());
        proportion.add(metaService.query3("Eating disorders","Any eating disorder","").getWeightedfor12());
        proportion.add(metaService.query3("Schizophrenia and other psychotic disorders","Schizophrenia or any other psychotic disorder","").getWeightedfor12());
        String s="{\"data\":[\n" +
                "   [\'焦虑障碍\', \'情绪障碍\', \'酒精药物使用障碍\', \'冲动障碍\',\'厌食症\',\'精神分裂与其他精神疾病\'],\n" +
                num+",\n" +
                proportion+",\n"+
                "]}";
        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
