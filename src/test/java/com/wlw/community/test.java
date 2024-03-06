package com.wlw.community;

import com.wlw.community.entity.Medicine;
import com.wlw.community.entity.Meta;
import com.wlw.community.service.MedicineService;
import com.wlw.community.service.MetaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class test {

    @Autowired
    private MetaService metaService;

    @Autowired
    private MedicineService medicineService;

    @Test
    public void test(){
        List<Medicine> medicine =medicineService.query("");
        System.out.println(medicine);
    }




}
