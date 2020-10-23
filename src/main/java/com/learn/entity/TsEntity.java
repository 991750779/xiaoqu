package com.learn.entity;

        import java.io.Serializable;
        import java.util.Date;



/**
 * 投诉信息
 *
 */
public class TsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            //
                    private Long id;
        
            //投诉标题
                    private String name;
        
            //详情
                    private String content;
        
            //投诉人
                    private Long user;

            private SysUserEntity sysUserEntity;

            public SysUserEntity getSysUserEntity() {
                return sysUserEntity;
            }

            public void setSysUserEntity(SysUserEntity sysUserEntity) {
                this.sysUserEntity = sysUserEntity;
            }

        
            //物业完成状态
                    private String state;
        
            //用户确认状态
                    private String ustate;
        
    
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
         * 设置：投诉标题
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取：投诉标题
         */
        public String getName() {
            return name;
        }
            /**
         * 设置：详情
         */
        public void setContent(String content) {
            this.content = content;
        }

        /**
         * 获取：详情
         */
        public String getContent() {
            return content;
        }
            /**
         * 设置：投诉人
         */
        public void setUser(Long user) {
            this.user = user;
        }

        /**
         * 获取：投诉人
         */
        public Long getUser() {
            return user;
        }
            /**
         * 设置：物业完成状态
         */
        public void setState(String state) {
            this.state = state;
        }

        /**
         * 获取：物业完成状态
         */
        public String getState() {
            return state;
        }
            /**
         * 设置：用户确认状态
         */
        public void setUstate(String ustate) {
            this.ustate = ustate;
        }

        /**
         * 获取：用户确认状态
         */
        public String getUstate() {
            return ustate;
        }
    }
