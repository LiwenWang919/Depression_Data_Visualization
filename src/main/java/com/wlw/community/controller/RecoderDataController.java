package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecoderDataController {

    @RequestMapping(path = "/visual/recoderdata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String recoderdata(){

        JSONObject jsonObject=new JSONObject();

        String s="{\"top\":[\n" +
                "   [\'受访人数\', \'本月新增\', \'本日新增\', \'本年度新增\', \'评估成功次数\', \'达标数\'],\n" +
                "   [120, 18, 2, 140,106,100],\n" +
                "],\n" +
                "\"subleft\":[" +
                "          {" +
                "            name: '安徽'," +
                "            value: 55" +
                "          }," +
                "          {" +
                "            name: '北京'," +
                "            value: 76" +
                "          }," +
                "          {" +
                "            name: '江苏'," +
                "            value: 66" +
                "          }," +
                "          {" +
                "            name: '河北'," +
                "            value: 54" +
                "          }," +
                "          {" +
                "            name: '浙江'," +
                "            value: 65" +
                "          }," +
                "          {" +
                "            name: '上海'," +
                "            value: 67" +
                "          }," +
                "          {" +
                "            name: '江西'," +
                "            value: 36" +
                "          }," +
                "          {" +
                "            name: '陕西'," +
                "            value: 45" +
                "          }," +
                "          {" +
                "            name: '甘肃'," +
                "            value: 34" +
                "          }," +
                "          {" +
                "            name: '河南'," +
                "            value: 43" +
                "          }" +
                "        ],\n" +
                "\"subright\":[" +
                "[\'男性发病率\',\'女性发病率\',\'全体发病率\'],\n" +
                "[5.7,8.0,6.8],\n" +
                "]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
