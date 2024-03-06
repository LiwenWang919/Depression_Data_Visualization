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
public class DiseaseCauseController {

    @Autowired
    private MetaService metaService;


    @RequestMapping(path = "/visual/diseasecause",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String DiseaseCause(){

        JSONObject jsonObject=new JSONObject();

        String s="{\"data\":[\n" +
                "   [\'遗传\', \'身体疾病\', \'人格\', \'生物节律变化\', \'生理因素\',\'心理和社会因素\'],\n" +
                "   [82, 113, 134, 68, 97, 112],\n" +
                "]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }


    @RequestMapping(path = "/visual/manydiseasecause",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String ManyDiseaseCause(){

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


        String s="{\"data\":[['焦虑障碍', '"+num.get(0)+"', \"<span  class='colorRed'>"+proportion.get(0)+"%</span>\"],\n" +
                "['情绪障碍', '"+num.get(1)+"', \"<span  class='colorRed'>"+proportion.get(1)+"%</span>\"],\n" +
                "['酒精药物使用障碍', '"+num.get(2)+"', \"<span  class='colorRed'>"+proportion.get(2)+"%</span>\"],\n" +
                "['冲动障碍', '"+num.get(3)+"', \"<span  class='colorGrass'>"+proportion.get(3)+"%</span>\"],\n" +
                "['厌食症', '"+num.get(4)+"', \"<span  class='colorGrass'>"+proportion.get(4)+"%</span>\"],\n" +
                "['精神疾病', '"+num.get(5)+"', \"<span  class='colorGrass'>"+proportion.get(5)+"%</span>\"]]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
