package com.wlw.community.controller;


import com.wlw.community.entity.Medicine;
import com.wlw.community.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @RequestMapping(path = "/visual/allmedicine",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public List<Medicine> allmedicine(){
        return medicineService.query("");
    }

    @RequestMapping(path = "/visual/medicine",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @CrossOrigin
    public List<Medicine> medicine(@RequestParam String condition){
        return medicineService.query(condition);
    }

}
