package com.wlw.community.service;

import com.wlw.community.dao.Hospital1Dao;
import com.wlw.community.entity.Hospital1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Hospital1)表服务接口
 *
 * @author makejava
 * @since 2022-03-13 20:45:05
 */
@Service
public class Hospital1Service {

    @Autowired
    private Hospital1Dao hospital1Dao;

    public List<Hospital1> queryByAll(){
        return hospital1Dao.queryByAll();
    }


}
