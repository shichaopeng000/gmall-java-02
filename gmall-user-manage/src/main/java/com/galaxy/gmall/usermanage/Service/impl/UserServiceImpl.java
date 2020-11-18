package com.galaxy.gmall.usermanage.Service.impl;

import com.galaxy.gmall.usermanage.Service.IUserInfoService;
import com.galaxy.gmall.usermanage.bean.UserInfo;
import com.galaxy.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author smile
 * @version 1.0
 * @Description:com.galaxy.gmall.usermanage.Service.impl
 * @date 2020/11/18 15:15
 */
@Service
public class UserServiceImpl  implements IUserInfoService {
   @Autowired
   private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfoListAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.updateByExampleSelective(userInfo,example);

    }

    @Override
    public void delUser(UserInfo userInfo) {
        userInfoMapper.deleteByPrimaryKey(userInfo);
    }
}
