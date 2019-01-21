package com.miaoshaproject.service;

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
}
