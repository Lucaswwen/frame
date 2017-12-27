package com.WeaDows.mapper;

import com.WeaDows.entity.WeaEqBinding;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WeaEqBindingMapper extends Mapper<WeaEqBinding> {
    List<WeaEqBinding> selectOneByEqId(Integer weId);
    List<WeaEqBinding> selectOneByUserId(Integer userId);
}