package com.gp.bishe.Controller;

import com.alibaba.fastjson.JSONObject;
import com.gp.bishe.constant.Constants;
import com.gp.bishe.pojo.User;
import com.gp.bishe.service.TokenService;
import com.gp.bishe.service.UserService;
import com.gp.bishe.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping(value = {"user" })
@Controller
public class UserController {

    @Autowired
    private  UserService userService;

    @Autowired
    private TokenService tokenService;

    //登录
    @RequestMapping("/login" )
    @ResponseBody
    public Object login(@RequestBody User user) {
        JSONObject jsonObject = new JSONObject();
        User userForBase = userService.login(user.getUsername());
        if (userForBase != null) {
            if (!userForBase.getUserpwd().equals(userForBase.getUserpwd())) {
                jsonObject.put("errmsg", "登录失败,密码错误");
                return jsonObject;
            }
            else {
                String token = tokenService.getUserToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                jsonObject.put("errmsg", "登录成功");
                return jsonObject;
            }
        }
        else {
            jsonObject.put("errmsg", "登录失败,用户不存在,请先注册");
            return jsonObject;
        }
    }

    //注册
    @RequestMapping("/register")
    @ResponseBody
    public JsonResult register(  User user) {
        System.out.println(user.toString());
        User userFroBase = userService.selectByName(user.getUsername());
        if(null != userFroBase){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.YEY_NAME_ERROR, 102);
            return jsonResult;
        }else{
            userService.insertUser(user);
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_REG_SUCCESS, 101);
            return jsonResult;
        }
    }
    @RequestMapping("/list")
    @ResponseBody
    public JsonResult getList(){
        List<User> userList = userService.getUserList();
        JsonResult jsonResult = new JsonResult(userList);
        return jsonResult;
    }
}
