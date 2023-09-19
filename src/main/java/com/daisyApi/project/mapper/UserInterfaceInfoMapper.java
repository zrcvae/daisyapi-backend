package com.daisyApi.project.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daisyApi.daisyApicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author zrc
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




