package com.wlw.community.dao;

import com.wlw.community.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Province)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-28 11:44:51
 */
@Mapper
public interface ProvinceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Province queryById(Integer id);


    long count();


    List<Province> queryTop5();

}

