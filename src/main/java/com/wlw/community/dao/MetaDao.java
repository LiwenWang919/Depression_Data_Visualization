package com.wlw.community.dao;

import com.wlw.community.entity.Meta;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import reactor.util.annotation.Nullable;

import java.util.List;

/**
 * (Meta)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-23 07:13:28
 */
@Mapper
public interface MetaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Meta queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param meta 查询条件
     * @return 总行数
     */
    long count(Meta meta);

    Meta query3(String top, @Nullable String mid, @Nullable String sub);

}

