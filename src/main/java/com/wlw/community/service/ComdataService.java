package com.wlw.community.service;

import com.wlw.community.dao.ComdataDao;
import com.wlw.community.entity.Comdata;
import com.wlw.community.entity.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.util.annotation.Nullable;

/**
 * (Comdata)表服务接口
 *
 * @author makejava
 * @since 2022-03-23 07:13:59
 */
@Service
public class ComdataService {


    @Autowired
    private ComdataDao comdataDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Comdata queryById(Integer id){
        return comdataDao.queryById(id);
    }

    public long count(Comdata comdata){
        return comdataDao.count(comdata);
    }

    public Comdata query3(String top, @Nullable String mid, @Nullable String sub){
        return comdataDao.query3(top,mid,sub);
    }
}
