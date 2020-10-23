package com.learn.service;

import com.learn.entity.TsEntity;

import java.util.List;
import java.util.Map;

/**
 * 投诉信息
 * 
 */
public interface TsService {
    /**
    * 查询
	* @return
	*/
	TsEntity queryObject(Long id);

    /**
    * 查询列表
    * @return
    */
	List<TsEntity> queryList(Map<String, Object> map);

    /**
    * 查询总数
    * @return
    */
	int queryTotal(Map<String, Object> map);

    /**
    * 保存
    * @return
    */
	void save(TsEntity ts);

    /**
    * 修改
    * @return
    */
	void update(TsEntity ts);

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
