package com.wlw.community.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wlw.community.entity.Hospital1;
import com.wlw.community.service.Hospital1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Hospital1)表控制层
 *
 * @author makejava
 * @since 2022-03-13 20:45:04
 */
@RestController
@RequestMapping("hospital1")
public class Hospital1Controller {
    /**
     * 服务对象
     */
    @Autowired
    private Hospital1Service hospital1Service;

    @GetMapping(path = "/allhospital",produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public String queryByALL() {
        List<Hospital1> hospital1s = new ArrayList<>();
        hospital1s = hospital1Service.queryByAll();
        String json = JSON.toJSONString(hospital1s);
//        JSONObject json = new JSONObject();
//        json.put("data",hospital1s);
//        return json.toJSONString();
        return json;
    }


}

