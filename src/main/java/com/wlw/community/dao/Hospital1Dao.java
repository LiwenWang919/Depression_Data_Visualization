package com.wlw.community.dao;

import com.wlw.community.entity.Hospital1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Hospital1)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-13 20:45:04
 */
@Mapper
public interface Hospital1Dao {


    List<Hospital1> queryByAll();
}

