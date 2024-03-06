package com.wlw.community.controller;


import com.wlw.community.entity.Allcountrydata;
import com.wlw.community.service.AllcountrydataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllCountryDataController {

    @Autowired
    private AllcountrydataService allcountrydataService;

    @RequestMapping(path = "/visual/allcountrydata",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public List<Allcountrydata> AllCountryDataController(){
        return allcountrydataService.allcountrydata();
    }

}
