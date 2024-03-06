package com.wlw.community.service;

import com.wlw.community.dao.SingledataDao;
import com.wlw.community.entity.Singledata;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Singledata)表服务接口
 *
 * @author makejava
 * @since 2022-02-28 11:45:04
 */
@Service
public class SingledataService {


    @Autowired
    private SingledataDao singledataDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Singledata queryById(Integer id){
        return singledataDao.queryById(id);
    }

}
