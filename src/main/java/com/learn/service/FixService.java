package com.learn.service;

import com.learn.entity.FixEntity;

import java.util.List;
import java.util.Map;

/**
 * 报修信息
 * 
 */
public interface FixService {
    /**
    * 查询
	* @return
	*/
	FixEntity queryObject(Long id);

    /**
    * 查询列表
    * @return
    */
	List<FixEntity> queryList(Map<String, Object> map);

    /**
    * 查询总数
    * @return
    */
	int queryTotal(Map<String, Object> map);

    /**
    * 保存
    * @return
    */
	void save(FixEntity fix);

    /**
    * 修改
    * @return
    */
	void update(FixEntity fix);

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
