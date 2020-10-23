package com.learn.entity;

        import java.io.Serializable;
        import java.util.Date;



/**
 * 楼栋信息
 *
 */
public class HouseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            //
                    private Long id;
        
            //楼栋编号
                    private String name;
        
            //层数
                    private String ceng;
        
            //房间数
                    private Integer room;
        
    
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
         * 设置：楼栋编号
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取：楼栋编号
         */
        public String getName() {
            return name;
        }
            /**
         * 设置：层数
         */
        public void setCeng(String ceng) {
            this.ceng = ceng;
        }

        /**
         * 获取：层数
         */
        public String getCeng() {
            return ceng;
        }
            /**
         * 设置：房间数
         */
        public void setRoom(Integer room) {
            this.room = room;
        }

        /**
         * 获取：房间数
         */
        public Integer getRoom() {
            return room;
        }
    }
