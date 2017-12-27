package com.WeaDows.util;

import com.WeaDows.entity.WeaEqBinding;
import com.WeaDows.entity.WeaEquipment;
import com.WeaDows.entity.WeaUser;
import com.WeaDows.mapper.WeaEqBindingMapper;
import com.WeaDows.mapper.WeaEquipmentMapper;
import com.WeaDows.mapper.WeaUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 王伟健 on 2017-11-22.
 */
public class ForwardUtil {
    @Autowired
    WeaEquipmentMapper weaEquipmentMapper;

    @Autowired
    WeaEqBindingMapper weaEqBindingMapper;

    @Autowired
    WeaUserMapper weaUserMapper;

    public void forwardMessage(String message,String ipAddress){
        String[] messages = message.split("_");
        String macAddress = messages[0];
        WeaEquipment eq = new WeaEquipment();
        eq.setMacAddress(macAddress);
        List<WeaEquipment> list = weaEquipmentMapper.select(eq);
        eq = list.get(0);
        Integer eqId = eq.getId();
      //  WeaEqBinding bind = weaEqBindingMapper.selectOneByEqId(eqId);
     //   Integer userId = bind.getUserId();
     //   WeaUser user = weaUserMapper.selectByPrimaryKey(userId);
       // String user.getIpAddress();
    }

}
