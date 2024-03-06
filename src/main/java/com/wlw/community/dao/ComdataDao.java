package com.wlw.community.dao;

import com.wlw.community.entity.Comdata;
import com.wlw.community.entity.Meta;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import reactor.util.annotation.Nullable;

import java.util.List;

/**
 * (Comdata)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-23 07:13:59
 */
@Mapper
public interface ComdataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Comdata queryById(Integer id);

    /**
     * 统计总行数
     *
     * @param comdata 查询条件
     * @return 总行数
     */
    long count(Comdata comdata);

    Comdata query3(String top, @Nullable String mid, @Nullable String sub);

}

