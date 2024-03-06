package com.wlw.community.dao;

import com.wlw.community.entity.Singledata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Singledata)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-28 11:45:03
 */
@Mapper
public interface SingledataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Singledata queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param singledata 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Singledata> queryAllByLimit(Singledata singledata, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param singledata 查询条件
     * @return 总行数
     */
    long count(Singledata singledata);

    /**
     * 新增数据
     *
     * @param singledata 实例对象
     * @return 影响行数
     */
    int insert(Singledata singledata);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Singledata> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Singledata> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Singledata> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Singledata> entities);

    /**
     * 修改数据
     *
     * @param singledata 实例对象
     * @return 影响行数
     */
    int update(Singledata singledata);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

