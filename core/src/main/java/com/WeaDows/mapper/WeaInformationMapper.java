package com.WeaDows.mapper;

import com.WeaDows.entity.WeaInformation;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WeaInformationMapper extends Mapper<WeaInformation> {
    List<WeaInformation> selectOneByEqId(Integer eqId);
    List<WeaInformation> selectLastByEqId(Integer eqId);
    List<WeaInformation> selectLastTenInfo(Integer eqId);
}