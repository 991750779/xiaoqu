package com.learn.entity;

        import java.io.Serializable;
        import java.util.Date;



/**
 * 车位信息
 *
 */
public class CarEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            //
                    private Long id;
        
            //车位号
                    private String name;
        
            //面积
                    private String size;
        
            //类型
                    private String type;
        
            //所属业主
                    private Long user;

            private SysUserEntity sysUserEntity;

            public SysUserEntity getSysUserEntity() {
                return sysUserEntity;
            }

            public void setSysUserEntity(SysUserEntity sysUserEntity) {
                this.sysUserEntity = sysUserEntity;
            }

        
            //到期时间
                    private String time;
        
    
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
         * 设置：车位号
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取：车位号
         */
        public String getName() {
            return name;
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
            /**
         * 设置：类型
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * 获取：类型
         */
        public String getType() {
            return type;
        }
            /**
         * 设置：所属业主
         */
        public void setUser(Long user) {
            this.user = user;
        }

        /**
         * 获取：所属业主
         */
        public Long getUser() {
            return user;
        }
            /**
         * 设置：到期时间
         */
        public void setTime(String time) {
            this.time = time;
        }

        /**
         * 获取：到期时间
         */
        public String getTime() {
            return time;
        }
    }
