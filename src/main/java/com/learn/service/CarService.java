package com.learn.service;

import com.learn.entity.CarEntity;

import java.util.List;
import java.util.Map;

/**
 * 车位信息
 * 
 */
public interface CarService {
    /**
    * 查询
	* @return
	*/
	CarEntity queryObject(Long id);

    /**
    * 查询列表
    * @return
    */
	List<CarEntity> queryList(Map<String, Object> map);

    /**
    * 查询总数
    * @return
    */
	int queryTotal(Map<String, Object> map);

    /**
    * 保存
    * @return
    */
	void save(CarEntity car);

    /**
    * 修改
    * @return
    */
	void update(CarEntity car);

    /**
    * 删除
    * @return
    */
	void delete(Long id);

    /**
    * 批量删除
    * @return
    */
	void deleteBatch(Long[] ids);
}
