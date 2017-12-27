package com.WeaDows.mapper;

import com.WeaDows.entity.WeaUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WeaUserMapper extends Mapper<WeaUser> {
    List<WeaUser> selectByUsername(String username);
}