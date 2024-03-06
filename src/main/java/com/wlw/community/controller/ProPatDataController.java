package com.wlw.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.wlw.community.entity.Province;
import com.wlw.community.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProPatDataController {


    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(path = "/visual/propatdata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String propatdata(){

        JSONObject jsonObject=new JSONObject();

        List<Province> ans = provinceService.queryTop5();

        System.out.println(ans);
        for (int i=0;i<ans.size();i++){
            Province province=new Province();
            province.setProvince(ans.get(i).getProvince());
            province.setPercent(10*(double) Math.round(ans.get(i).getPercent()*100 * 100) / 100);
            province.setId(ans.get(i).getId());
            province.setSum(ans.get(i).getSum());
            province.setYear(ans.get(i).getYear());
            ans.set(i,province);
        }
        System.out.println(ans);

        String s="{data: [\n" +
                "          {\n" +
                "            name: '"+ans.get(0).getProvince()+"',\n" +
                "            value: "+ans.get(0).getPercent()+"\n" +
                "          },\n" +
                "          {\n" +
                "            name: '"+ans.get(1).getProvince()+"',\n" +
                "            value: "+ans.get(1).getPercent()+"\n" +
                "          },\n" +
                "          {\n" +
                "            name: '"+ans.get(2).getProvince()+"',\n" +
                "            value: "+ans.get(2).getPercent()+"\n" +
                "          },\n" +
                "          {\n" +
                "            name: '"+ans.get(3).getProvince()+"',\n" +
                "            value: "+ans.get(3).getPercent()+"\n" +
                "          },\n" +
                "          {\n" +
                "            name: '"+ans.get(4).getProvince()+"',\n" +
                "            value: "+ans.get(4).getPercent()+"\n" +
                "          }\n" +
                "        ]}";

        jsonObject=JSONObject.parseObject(s);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
