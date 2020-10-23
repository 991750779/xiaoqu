package com.learn.service.impl;

import com.learn.dao.HouseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


import com.learn.dao.RoomDao;
import com.learn.entity.RoomEntity;
import com.learn.service.RoomService;


@Service("roomService")
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomDao roomDao;

    @Autowired
    HouseDao houseDao;

    @Override
    public RoomEntity queryObject(Long id) {
        RoomEntity entity = roomDao.queryObject(id);
        if (entity.getHouse() != null && this.houseDao.queryObject(entity.getHouse()) != null)
            entity.setHouseEntity(this.houseDao.queryObject(entity.getHouse()));

        return entity;
    }

    @Override
    public List<RoomEntity> queryList(Map<String, Object> map) {
        List<RoomEntity> list = roomDao.queryList(map);
        for (RoomEntity entity : list) {
            if (entity.getHouse() != null && this.houseDao.queryObject(entity.getHouse()) != null)
                entity.setHouseEntity(this.houseDao.queryObject(entity.getHouse()));
        }
        return list;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return roomDao.queryTotal(map);
    }

    @Override
    public void save(RoomEntity room) {
        roomDao.save(room);
    }

    @Override
    public void update(RoomEntity room) {
        roomDao.update(room);
    }

    @Override
    public void delete(Long id) {
        roomDao.delete(id);
    }

    @Override
    public void deleteBatch(Long[] ids) {
        roomDao.deleteBatch(ids);
    }

}
