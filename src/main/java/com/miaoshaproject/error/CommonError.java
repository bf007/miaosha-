package com.miaoshaproject.error;

/**
 * @ProjectName: miaosha
 * @Package: com.miaoshaproject.error
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: fengbing
 * @CreateDate: 2019/1/23 11:45 AM
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
