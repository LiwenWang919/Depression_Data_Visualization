package com.wlw.community.service;

import com.wlw.community.dao.MetaDao;
import com.wlw.community.entity.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.util.annotation.Nullable;

/**
 * (Meta)表服务接口
 *
 * @author makejava
 * @since 2022-03-23 07:13:29
 */
@Service
public class MetaService {

    @Autowired
    private MetaDao metaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Meta queryById(Integer id){
        return metaDao.queryById(id);
    }

    public long count(Meta meta){
        return metaDao.count(meta);
    }

    public Meta query3(String top, @Nullable String mid, @Nullable String sub){
        return metaDao.query3(top,mid,sub);
    }

}
