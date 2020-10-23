package com.learn.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 房间信息
 *
 */
public class RoomEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long id;

    //房号
    private String name;

    //所属楼栋
    private Long house;

    //面积
    private String size;

    private HouseEntity houseEntity;

    public HouseEntity getHouseEntity() {
        return houseEntity;
    }

    public void setHouseEntity(HouseEntity houseEntity) {
        this.houseEntity = houseEntity;
    }

    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：房号
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：房号
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：所属楼栋
     */
    public void setHouse(Long house) {
        this.house = house;
    }

    /**
     * 获取：所属楼栋
     */
    public Long getHouse() {
        return house;
    }

    /**
     * 设置：面积
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取：面积
     */
    public String getSize() {
        return size;
    }
}
