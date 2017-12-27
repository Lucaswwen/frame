package com.WeaDows.mapper;

import com.WeaDows.entity.WeaEquipment;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WeaEquipmentMapper extends Mapper<WeaEquipment> {
    List<WeaEquipment> selectOneByName(String name);
}