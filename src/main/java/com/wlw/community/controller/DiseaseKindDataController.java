package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseKindDataController {

    @RequestMapping(path = "/visual/diseasekinddata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String diseasekinddata(){

        JSONObject jsonObject=new JSONObject();

        String s="{indicatorData: [\n" +
                "          { name: \"焦虑障碍\", max: 300 },\n" +
                "          { name: \"情绪障碍\", max: 250 },\n" +
                "          { name: \"酒精药物使用障碍\", max: 300 },\n" +
                "          { name: \"冲动障碍\", max: 5},\n" +
                "          { name: \"厌食症\", max: 200 },\n" +
                "          { name: \"精神疾病\", max: 100 }\n" +
                "        ],\n" +
                "        dataBJ: [\n" +
                "          [94, 69, 114, 2.08, 73, 39, 22],\n" +
                "          [99, 73, 110, 2.43, 76, 48, 23],\n" +
                "          [31, 12, 30, 0.5, 32, 16, 24],\n" +
                "          [42, 27, 43, 1, 53, 22, 25],\n" +
                "          [154, 117, 157, 3.05, 92, 58, 26],\n" +
                "          [234, 185, 230, 4.09, 123, 69, 27],\n" +
                "          [160, 120, 186, 2.77, 91, 50, 28]\n" +
                "        ],\n" +
                "        dataGZ: [\n" +
                "          [84, 94, 140, 2.238, 68, 18, 22],\n" +
                "          [93, 77, 104, 1.165, 53, 7, 23],\n" +
                "          [99, 130, 227, 3.97, 55, 15, 24],\n" +
                "          [146, 84, 139, 1.094, 40, 17, 25],\n" +
                "          [113, 108, 137, 1.481, 48, 15, 26],\n" +
                "          [81, 48, 62, 1.619, 26, 3, 27],\n" +
                "          [56, 48, 68, 1.336, 37, 9, 28]\n" +
                "        ],\n" +
                "        dataSH: [\n" +
                "          [91, 45, 125, 0.82, 34, 23, 1],\n" +
                "          [65, 27, 78, 0.86, 45, 29, 2],\n" +
                "          [83, 60, 84, 1.09, 73, 27, 3],\n" +
                "          [109, 81, 121, 1.28, 68, 51, 4],\n" +
                "          [106, 77, 114, 1.07, 55, 51, 5],\n" +
                "          [109, 81, 121, 1.28, 68, 51, 6],\n" +
                "          [106, 77, 114, 1.07, 55, 51, 7]\n" +
                "        ]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
