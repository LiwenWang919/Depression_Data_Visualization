package com.wlw.community.service;

import com.wlw.community.dao.MedicineDao;
import com.wlw.community.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Medicine)表服务接口
 *
 * @author makejava
 * @since 2022-03-31 11:06:11
 */
@Service
public class MedicineService {

    @Autowired
    private MedicineDao medicineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Medicine queryById(Integer id){
        return medicineDao.queryById(id);
    }

    public List<Medicine> query(String condition){
        condition="%"+condition+"%";
        return medicineDao.query(condition);
    }

}
