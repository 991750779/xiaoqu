package com.learn.service;

import com.learn.entity.HouseEntity;

import java.util.List;
import java.util.Map;

/**
 * 楼栋信息
 * 
 */
public interface HouseService {
    /**
    * 查询
	* @return
	*/
	HouseEntity queryObject(Long id);

    /**
    * 查询列表
    * @return
    */
	List<HouseEntity> queryList(Map<String, Object> map);

    /**
    * 查询总数
    * @return
    */
	int queryTotal(Map<String, Object> map);

    /**
    * 保存
    * @return
    */
	void save(HouseEntity house);

    /**
    * 修改
    * @return
    */
	void update(HouseEntity house);

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
