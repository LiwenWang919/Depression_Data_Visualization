package com.wlw.community.controller;


import com.alibaba.fastjson.JSONObject;
import com.wlw.community.dao.ProvinceDao;
import com.wlw.community.entity.Province;
import com.wlw.community.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ChinaDataController {


    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(path = "/visual/chinadata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String chinadata(){

        JSONObject jsonObject=new JSONObject();

        long count = provinceService.count();

        List pros = new ArrayList<Province>();

        System.out.println(provinceService.queryById(1));

        for (int i=1;i<=count;i++){

            Province province = provinceService.queryById(i);

            province.setPercent((double) Math.round(province.getPercent()*100 * 100) / 100);

            pros.add(province);
        }


        System.out.println(pros);
        jsonObject.put("datalist",pros);
        String jsonStr=JSONObject.toJSONString(jsonObject);
        return jsonStr;
    }

}
