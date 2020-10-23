package com.learn.service;

import com.learn.entity.RoomEntity;

import java.util.List;
import java.util.Map;

/**
 * 房间信息
 * 
 */
public interface RoomService {
    /**
    * 查询
	* @return
	RoomEntity queryObject(Long id);

    /**
    * 查询列表
    * @return
    */
	List<RoomEntity> queryList(Map<String, Object> map);

    /**
    * 查询总数
    * @return
    */
	int queryTotal(Map<String, Object> map);

    /**
    * 保存
    * @return
    */
	void save(RoomEntity room);

    /**
    * 修改
    * @return
    */
	void update(RoomEntity room);

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
