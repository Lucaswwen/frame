package com.WeaDows.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wea_eq_binding")
public class WeaEqBinding implements Serializable {
    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备id
     */
    @Column(name = "eq_id")
    private Integer eqId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增id
     *
     * @return id - 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增id
     *
     * @param id 自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备id
     *
     * @return eq_id - 设备id
     */
    public Integer getEqId() {
        return eqId;
    }

    /**
     * 设置设备id
     *
     * @param eqId 设备id
     */
    public void setEqId(Integer eqId) {
        this.eqId = eqId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eqId=").append(eqId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}