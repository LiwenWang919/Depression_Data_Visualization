package com.wlw.community.service;

import com.wlw.community.dao.AllcountrydataDao;
import com.wlw.community.entity.Allcountrydata;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Allcountrydata)表服务接口
 *
 * @author makejava
 * @since 2022-02-28 11:37:59
 */
@Service
public class AllcountrydataService {


    @Autowired
    private AllcountrydataDao allcountrydataDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Allcountrydata queryById(Integer id){
        return allcountrydataDao.queryById(id);
    }

    public List<Allcountrydata> allcountrydata(){
        return allcountrydataDao.allcountrydata();
    }

}
