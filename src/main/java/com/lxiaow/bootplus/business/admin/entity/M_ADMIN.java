package com.lxiaow.bootplus.business.admin.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 平台管理员数据表
 * </p>
 *
 * @author lXiaow
 * @since 2020-01-03
 */
public class M_ADMIN extends Model<M_ADMIN> {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    @TableId(value = "ADM_ADMIN_ID", type = IdType.AUTO)
    private Integer ADM_ADMIN_ID;

    /**
     * 管理员用户名
     */
    private String ADM_ADMIN_NAME;

    /**
     * 管理员登录密码
     */
    private String ADM_ADMIN_PASSWORD;

    /**
     * 是否为超级管理员
     */
    private Integer ADM_IS_SUPER_ADMIN;

    /**
     * 状态：1生效 0失效
     */
    private Integer ADM_STATUS;

    private Integer ADM_ERROR_COUNT;

    private Date ADM_LAST_LOGIN_TIME;

    /**
     * 省份 all 为全部
     */
    private String ADM_PROVINCE;

    private String ADM_ADMIN_PHONE;

    /**
     * 邮箱
     */
    private String ADM_ADMIN_EMAIL;

    private Integer GROUP_ID;

    public Integer getADM_ADMIN_ID() {
        return ADM_ADMIN_ID;
    }

    public void setADM_ADMIN_ID(Integer ADM_ADMIN_ID) {
        this.ADM_ADMIN_ID = ADM_ADMIN_ID;
    }
    public String getADM_ADMIN_NAME() {
        return ADM_ADMIN_NAME;
    }

    public void setADM_ADMIN_NAME(String ADM_ADMIN_NAME) {
        this.ADM_ADMIN_NAME = ADM_ADMIN_NAME;
    }
    public String getADM_ADMIN_PASSWORD() {
        return ADM_ADMIN_PASSWORD;
    }

    public void setADM_ADMIN_PASSWORD(String ADM_ADMIN_PASSWORD) {
        this.ADM_ADMIN_PASSWORD = ADM_ADMIN_PASSWORD;
    }
    public Integer getADM_IS_SUPER_ADMIN() {
        return ADM_IS_SUPER_ADMIN;
    }

    public void setADM_IS_SUPER_ADMIN(Integer ADM_IS_SUPER_ADMIN) {
        this.ADM_IS_SUPER_ADMIN = ADM_IS_SUPER_ADMIN;
    }
    public Integer getADM_STATUS() {
        return ADM_STATUS;
    }

    public void setADM_STATUS(Integer ADM_STATUS) {
        this.ADM_STATUS = ADM_STATUS;
    }
    public Integer getADM_ERROR_COUNT() {
        return ADM_ERROR_COUNT;
    }

    public void setADM_ERROR_COUNT(Integer ADM_ERROR_COUNT) {
        this.ADM_ERROR_COUNT = ADM_ERROR_COUNT;
    }
    public Date getADM_LAST_LOGIN_TIME() {
        return ADM_LAST_LOGIN_TIME;
    }

    public void setADM_LAST_LOGIN_TIME(Date ADM_LAST_LOGIN_TIME) {
        this.ADM_LAST_LOGIN_TIME = ADM_LAST_LOGIN_TIME;
    }
    public String getADM_PROVINCE() {
        return ADM_PROVINCE;
    }

    public void setADM_PROVINCE(String ADM_PROVINCE) {
        this.ADM_PROVINCE = ADM_PROVINCE;
    }
    public String getADM_ADMIN_PHONE() {
        return ADM_ADMIN_PHONE;
    }

    public void setADM_ADMIN_PHONE(String ADM_ADMIN_PHONE) {
        this.ADM_ADMIN_PHONE = ADM_ADMIN_PHONE;
    }
    public String getADM_ADMIN_EMAIL() {
        return ADM_ADMIN_EMAIL;
    }

    public void setADM_ADMIN_EMAIL(String ADM_ADMIN_EMAIL) {
        this.ADM_ADMIN_EMAIL = ADM_ADMIN_EMAIL;
    }
    public Integer getGROUP_ID() {
        return GROUP_ID;
    }

    public void setGROUP_ID(Integer GROUP_ID) {
        this.GROUP_ID = GROUP_ID;
    }

    @Override
    protected Serializable pkVal() {
        return this.ADM_ADMIN_ID;
    }

    @Override
    public String toString() {
        return "M_ADMIN{" +
        "ADM_ADMIN_ID=" + ADM_ADMIN_ID +
        ", ADM_ADMIN_NAME=" + ADM_ADMIN_NAME +
        ", ADM_ADMIN_PASSWORD=" + ADM_ADMIN_PASSWORD +
        ", ADM_IS_SUPER_ADMIN=" + ADM_IS_SUPER_ADMIN +
        ", ADM_STATUS=" + ADM_STATUS +
        ", ADM_ERROR_COUNT=" + ADM_ERROR_COUNT +
        ", ADM_LAST_LOGIN_TIME=" + ADM_LAST_LOGIN_TIME +
        ", ADM_PROVINCE=" + ADM_PROVINCE +
        ", ADM_ADMIN_PHONE=" + ADM_ADMIN_PHONE +
        ", ADM_ADMIN_EMAIL=" + ADM_ADMIN_EMAIL +
        ", GROUP_ID=" + GROUP_ID +
        "}";
    }
}
