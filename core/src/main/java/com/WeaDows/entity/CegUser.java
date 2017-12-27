package com.WeaDows.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "ceg_user")
public class CegUser implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 编号
     */
    private String code;

    /**
     * 帐号
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 角色:10普通用户,20合伙人,30商家
     */
    private Integer role;

    /**
     * 客户端标识
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * 客户端密钥
     */
    @Column(name = "client_secret")
    private String clientSecret;

    /**
     * 推荐人,如果没有推荐人默认00000000
     */
    private String referee;

    /**
     * 头像地址
     */
    private String photourl;

    /**
     * 生成推荐二维码地址
     */
    private String qrurl;

    /**
     * 是否帐号启用状态：Y:代表启用，N:代表未启用。
     */
    @Column(name = "is_enable")
    private String isEnable;

    /**
     * 如果帐号被停用了可以写一个备份
     */
    private String bz;

    /**
     * 微信的openid
     */
    private String openid;

    /**
     * 支付密码
     */
    private String paypwd;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取编号
     *
     * @return code - 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编号
     *
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取帐号
     *
     * @return username - 帐号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置帐号
     *
     * @param username 帐号
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取电子邮箱
     *
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取角色:10普通用户,20合伙人,30商家
     *
     * @return role - 角色:10普通用户,20合伙人,30商家
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色:10普通用户,20合伙人,30商家
     *
     * @param role 角色:10普通用户,20合伙人,30商家
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取客户端标识
     *
     * @return client_id - 客户端标识
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置客户端标识
     *
     * @param clientId 客户端标识
     */
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    /**
     * 获取客户端密钥
     *
     * @return client_secret - 客户端密钥
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 设置客户端密钥
     *
     * @param clientSecret 客户端密钥
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    /**
     * 获取推荐人,如果没有推荐人默认00000000
     *
     * @return referee - 推荐人,如果没有推荐人默认00000000
     */
    public String getReferee() {
        return referee;
    }

    /**
     * 设置推荐人,如果没有推荐人默认00000000
     *
     * @param referee 推荐人,如果没有推荐人默认00000000
     */
    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    /**
     * 获取头像地址
     *
     * @return photourl - 头像地址
     */
    public String getPhotourl() {
        return photourl;
    }

    /**
     * 设置头像地址
     *
     * @param photourl 头像地址
     */
    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    /**
     * 获取生成推荐二维码地址
     *
     * @return qrurl - 生成推荐二维码地址
     */
    public String getQrurl() {
        return qrurl;
    }

    /**
     * 设置生成推荐二维码地址
     *
     * @param qrurl 生成推荐二维码地址
     */
    public void setQrurl(String qrurl) {
        this.qrurl = qrurl == null ? null : qrurl.trim();
    }

    /**
     * 获取是否帐号启用状态：Y:代表启用，N:代表未启用。
     *
     * @return is_enable - 是否帐号启用状态：Y:代表启用，N:代表未启用。
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**
     * 设置是否帐号启用状态：Y:代表启用，N:代表未启用。
     *
     * @param isEnable 是否帐号启用状态：Y:代表启用，N:代表未启用。
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    /**
     * 获取如果帐号被停用了可以写一个备份
     *
     * @return bz - 如果帐号被停用了可以写一个备份
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置如果帐号被停用了可以写一个备份
     *
     * @param bz 如果帐号被停用了可以写一个备份
     */
    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    /**
     * 获取微信的openid
     *
     * @return openid - 微信的openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信的openid
     *
     * @param openid 微信的openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取支付密码
     *
     * @return paypwd - 支付密码
     */
    public String getPaypwd() {
        return paypwd;
    }

    /**
     * 设置支付密码
     *
     * @param paypwd 支付密码
     */
    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd == null ? null : paypwd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", username=").append(username);
        sb.append(", nickname=").append(nickname);
        sb.append(", mobile=").append(mobile);
        sb.append(", birthday=").append(birthday);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", createTime=").append(createTime);
        sb.append(", role=").append(role);
        sb.append(", clientId=").append(clientId);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", referee=").append(referee);
        sb.append(", photourl=").append(photourl);
        sb.append(", qrurl=").append(qrurl);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", bz=").append(bz);
        sb.append(", openid=").append(openid);
        sb.append(", paypwd=").append(paypwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}