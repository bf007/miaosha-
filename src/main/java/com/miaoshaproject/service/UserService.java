package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @ProjectName: miaosha
 * @Package: com.miaoshaproject.service
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: fengbing
 * @CreateDate: 2019/1/21 2:25 PM
 */

public interface UserService {

    //通过用户id获取用户对象的方法
    UserModel getUserById(Integer id);


    void register(UserModel userModel) throws BusinessException;



    /*
    telphone:用户注册手机
    password:用户加密密码
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
