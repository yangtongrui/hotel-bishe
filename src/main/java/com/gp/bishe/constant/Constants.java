package com.gp.bishe.constant;

import javax.xml.soap.SAAJResult;

public class Constants {

    public interface Url{
        String API = "http://localhost:8082";
        String VERIFY_TOKEN = API + "/checkToken";
        String GET_USER_INFOR = API + "/getUserInfor";
    }

    public interface MessageStr{
        String MSG_ADD_SUCCESS = "添加成功!";
        String MSG_SET_SUCCESS = "设置成功!";
        String MSG_UPDATE_SUCCESS = "更改成功!";
        String MSG_DELE_SUCCESS = "删除成功!";
        String MSG_REG_SUCCESS = "注册成功!";
        String NO_DATA_ERROR = "日期为空，请选择";
        String NO_NUMB_ERROR = "输入为空或者输入错误";
        String NO_PIC_ERROR = "图片未上传，请选择";
        String NO_TYPE_ERROR = "类型为空，请选择";
        String NO_SIZE_ERROR = "大小为空或数字小于0，请输入";
        String NO_THING_ERROR = "物品为空，请输入";
        String NO_NUM_ERROR = "价格为空或者输入错误，请输入";
        String NO_POWER_ERROR = "权限不够！！！";
        String YEY_TYPE_ERROR = "此类型已存在";
        String YEY_NAME_ERROR = "此用户已存在";
        String NO_BIRTH_ERROR = "生日日期不符或无该数据，请前往信息设置进行设置";
        String NO_PHONE_ERROR = "电话号码不符或无该数据，请前往信息设置进行设置";
        String NO_EMAIL_ERROR = "邮箱不符或无该数据，请前往信息设置进行设置";
        String NO_PREFIX_ERROR = "电话区域号不符或无该数据，请前往信息设置进行设置";
        String MSG_NOBOOKMARK_SUCCESS = "取消收藏成功!";
        String NO_KEYWORD_ERROR = "请输入关键字";
        String NO_TOKENID_ERROR = "请携带tokenId";
        String NO_CATEGORYID_ERROR = "请携带分类ID";
        String NO_TAG_ERROR = "请携带tag";
        String NO_COURSE_ERROR = "请输入课程id";
        String NO_TOKEN_ERROE = "无token，请在header中携带";
        String TOKEN_TIMEOUT_ERROR = "token已失效，请重新登录";
        String NO_PATHID_ERROR = "请携带PathId";
        String NO_SECID_ERROR = "请携带Id";
        String NO_MARKID_ERROR = "请携带标签Id";
        int TOTAL_SCORE = 300;
    }

}
