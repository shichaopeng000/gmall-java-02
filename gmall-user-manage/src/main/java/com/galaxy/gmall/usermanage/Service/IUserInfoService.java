package com.galaxy.gmall.usermanage.Service;

import com.galaxy.gmall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * @author smile
 * @version 1.0
 * @Description:com.galaxy.gmall.usermanage.Service
 * @date 2020/11/18 15:14
 */
public interface IUserInfoService {
    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);

}
