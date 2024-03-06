package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducateStateController {

    @RequestMapping(path = "/visual/educatestate",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String DiseaseCause(){

        JSONObject jsonObject=new JSONObject();

        String s="{xData: [\"未受教育\", \"小学\", \"初中\", \"高中\", \"高等教育\"],\n" +
                "        seriesData: [\n" +
                "          { value: 7.4, name: \"未受教育\" },\n" +
                "          { value: 6.9, name: \"小学\" },\n" +
                "          { value: 6.5, name: \"初中\" },\n" +
                "          { value: 6.0, name: \"高中\" },\n" +
                "          { value: 5.2, name: \"高等教育\" },\n" +
                "        ]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
