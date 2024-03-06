package com.wlw.community.dao;

import com.wlw.community.entity.Medicine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Medicine)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-31 11:06:11
 */
@Mapper
public interface MedicineDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Medicine queryById(Integer id);

    List<Medicine> query(String condition);

}

