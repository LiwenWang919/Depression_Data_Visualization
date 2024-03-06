package com.wlw.community.dao;

import com.wlw.community.entity.Allcountrydata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Allcountrydata)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-28 11:37:48
 */
@Mapper
public interface AllcountrydataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Allcountrydata queryById(Integer id);


    @Select("select * from allcountrydata where id < 100")
    List<Allcountrydata> allcountrydata();

}

