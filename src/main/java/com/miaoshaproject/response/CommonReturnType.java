package com.miaoshaproject.response;

/**
 * @ProjectName: miaosha
 * @Package: com.miaoshaproject.response
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: fengbing
 * @CreateDate: 2019/1/23 11:26 AM
 */
public class CommonReturnType {
    //表明对应请求的返回处理结果 "success"或"fail"
    private String status;

    //若status=success,则data内返回前段需要的json数据
    //若status=fail,则data内使用公用的错误码格式
    private Object data;


    //定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");

    }
    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;

    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
