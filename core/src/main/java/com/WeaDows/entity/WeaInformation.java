package com.WeaDows.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wea_information")
public class WeaInformation implements Serializable {
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
     * 温度
     */
    private Double temperature;

    /**
     * 湿度
     */
    private Double humidity;

    /**
     * 1为报警,2为正常,3为设备故障
     */
    private Integer smoke;

    /**
     * 信息插入时间
     */
    private Date date;

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
     * 获取温度
     *
     * @return temperature - 温度
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * 设置温度
     *
     * @param temperature 温度
     */
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取湿度
     *
     * @return humidity - 湿度
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * 设置湿度
     *
     * @param humidity 湿度
     */
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    /**
     * 获取1为报警,2为正常,3为设备故障
     *
     * @return smoke - 1为报警,2为正常,3为设备故障
     */
    public Integer getSmoke() {
        return smoke;
    }

    /**
     * 设置1为报警,2为正常,3为设备故障
     *
     * @param smoke 1为报警,2为正常,3为设备故障
     */
    public void setSmoke(Integer smoke) {
        this.smoke = smoke;
    }

    /**
     * 获取信息插入时间
     *
     * @return date - 信息插入时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置信息插入时间
     *
     * @param date 信息插入时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eqId=").append(eqId);
        sb.append(", temperature=").append(temperature);
        sb.append(", humidity=").append(humidity);
        sb.append(", smoke=").append(smoke);
        sb.append(", date=").append(date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}