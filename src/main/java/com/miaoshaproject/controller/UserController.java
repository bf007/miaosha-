package com.miaoshaproject.controller;

import com.miaoshaproject.controller.viewobject.UserVo;
import com.miaoshaproject.service.UserService;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: miaosha
 * @Package: com.miaoshaproject.controller
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: fengbing
 * @CreateDate: 2019/1/21 2:21 PM
 */


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    //下面的方法将领域模型返回给前段是非常不科学的
    public UserVo getUser(@RequestParam(name="id") Integer id){
        //调用service服务获取对应id的用户对象并返回给前段
        UserModel userModel = userService.getUserById(id);

        //将核心领域模型转化为可供UI使用的viewobject
        return convertFromModel(userModel);
    }


    private UserVo convertFromModel(UserModel userModel){
        if(userModel == null){
            return null;
        }
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userModel,userVo);
        return userVo;
    }
}
