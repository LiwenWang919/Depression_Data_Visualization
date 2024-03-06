package com.wlw.community.service;

import com.wlw.community.dao.ProvinceDao;
import com.wlw.community.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Province)表服务接口
 *
 * @author makejava
 * @since 2022-02-28 11:44:51
 */
@Service
public class ProvinceService {


    @Autowired
    private ProvinceDao provinceDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Province queryById(Integer id){
        return provinceDao.queryById(id);
    }


    public long count(){
        return provinceDao.count();
    }

    public List<Province> queryTop5(){
        return provinceDao.queryTop5();
    }

}
