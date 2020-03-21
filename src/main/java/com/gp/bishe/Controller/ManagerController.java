package com.gp.bishe.Controller;

import com.alibaba.fastjson.JSONObject;
import com.gp.bishe.constant.Constants;
import com.gp.bishe.pojo.Manager;
import com.gp.bishe.pojo.ManagerAddress;
import com.gp.bishe.service.ManagerService;
import com.gp.bishe.service.TokenService;
import com.gp.bishe.vo.JsonResult;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping(value = {"manager" })
@RestController
public class ManagerController {

    @Autowired
    private TokenService tokenService;
    @Autowired
    private ManagerService managerService;


    //登录
    @RequestMapping("/login")
    @ResponseBody
    public Object login(@RequestBody Manager manager) {
        JSONObject jsonObject = new JSONObject();
        Manager managerForBase = managerService.login(manager.getManagername());
        if (managerForBase != null) {
            if (!managerForBase.getManagerpwd().equals(manager.getManagerpwd())) {
                jsonObject.put("errmsg", "登录失败,密码错误");
                return jsonObject;
            }
            else {
                String token = tokenService.getToken(managerForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", managerForBase);
                jsonObject.put("errmsg", "登录成功");
                return jsonObject;
            }
        }
        else {
            jsonObject.put("errmsg", "登录失败,用户不存在");
            return jsonObject;

        }
    }

    //修改密码
    @RequestMapping("/changepwd")
    @ResponseBody
    public JsonResult changePwd(Manager manager) {
       Manager managerforBase = managerService.selectManagerByName(manager.getManagername());
       if(!managerforBase.getBirthday().equals(manager.getBirthday()) || null == manager.getBirthday())
       {
           JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_BIRTH_ERROR, 102);
           return jsonResult;
       }
       if(!managerforBase.getPhone().equals(manager.getPhone()) || null == manager.getPhone()){
           JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_PHONE_ERROR, 102);
           return jsonResult;
       }
        if(!managerforBase.getPrefix().equals(manager.getPrefix()) ){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_PREFIX_ERROR, 102);
            return jsonResult;
        }
       if(!managerforBase.getEmail().equals(manager.getEmail()) || null == manager.getEmail()){
           JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_EMAIL_ERROR, 102);
           return jsonResult;
       }else {
           manager.setManagerid(managerforBase.getManagerid());
           managerService.changePwd(manager);
           JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_UPDATE_SUCCESS, 101);
           return jsonResult;
       }
    }
    //信息设置
    @RequestMapping("/updatemessage")
    @ResponseBody
    public JsonResult updateMessage( Manager manager){
        ManagerAddress manager1 = managerService.selectById(manager.getManagerid());
        if(null == manager1 || manager1.getManagerid() != manager.getManagerid()){
            managerService.insertAddressID(manager.getManagerid());
        }
     if(null == manager.getEmail()){
         JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
         return jsonResult;
     }
     if(null == manager.getBirthday()) {
         JsonResult jsonResult = new JsonResult(null,Constants.MessageStr.NO_NUMB_ERROR, 102);
         return jsonResult;
     }
     Integer age = manager.getAge();
     if(null == age){
         JsonResult jsonResult = new JsonResult(null,Constants.MessageStr.NO_NUMB_ERROR, 102);
         return jsonResult;
     }
     if(null == manager.getPhone()){
         JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
         return jsonResult;
     }
     if(null == manager.getSex()){
         JsonResult jsonResult = new JsonResult(null,Constants.MessageStr.NO_NUMB_ERROR, 102);
         return jsonResult;
     }
     Manager managerforBase = managerService.selectManagerByName(manager.getManagername());
     manager.setManagerid(managerforBase.getManagerid());
     managerService.updateMessage(manager);
     String[] str = manager.getAddress();
        System.out.println(Arrays.toString(str));
     ManagerAddress managerAddress = new ManagerAddress();
     managerAddress.setManagername(manager.getManagername());
     managerAddress.setManagerid(manager.getManagerid());
     if(3 == str.length){
         managerAddress.setProvince(str[0]);
         managerAddress.setCity(str[1]);
         managerAddress.setDistrict(str[2]);
         managerService.updateAddressC(managerAddress);
     }
     if(2 == str.length ){
         managerAddress.setProvince(str[0]);
         managerAddress.setCity(str[1]);
         managerService.updateAddressB(managerAddress);
     }else
     {
         managerAddress.setCity(str[0]);
         managerService.updateAddressA(managerAddress);
     }

     JsonResult jsonResult = new JsonResult(null,Constants.MessageStr.MSG_SET_SUCCESS, 101);
     return jsonResult;
    }
    //列表
    @RequestMapping("/list")
    @ResponseBody
    public JsonResult getManagerList() {
        List<Manager> managerList = managerService.getManagerList();
        JsonResult jsonResult = new JsonResult(managerList);
        return jsonResult;
    }

    //添加
    @RequestMapping("/insert")
    public JsonResult insertManager(Manager manager, HttpServletRequest req) throws InvocationTargetException, IllegalAccessException, IOException {
        System.out.println(manager.toString());
        Map<String, String[]> parameterMap = req.getParameterMap();
        BeanUtils.populate(manager, parameterMap);
        if (null == manager.getManagername()) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if (null == manager.getManagerpwd()) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if (null == manager.getManagerdate()) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        Integer managersign = manager.getManagersign();
        if (null == managersign) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        Manager managerByName = managerService.selectManagerByName(manager.getManagername());
        if (managerByName != null) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.YEY_NAME_ERROR, 102);
            return jsonResult;
        } else {
            managerService.insertManager(manager);
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_ADD_SUCCESS, 101);
            return jsonResult;
        }
    }

    //删除
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult deleteManagerById(Manager manager)  {
        Manager managerforBase = managerService.selectManagerByName(manager.getCreater());
        if(3 == managerforBase.getManagersign() ){
            managerService.deleteManagerById(manager.getManagerid());
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_DELE_SUCCESS, 102);
            return jsonResult;
        }else {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_POWER_ERROR, 101);
            return jsonResult;
        }
    }
    //查找
    @RequestMapping("/selectById")
    @ResponseBody
    public JsonResult selectById(int id){
        if(null == new Integer(id)){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SECID_ERROR, 102);
            return jsonResult;
        }
        Manager manager = managerService.selectbyId(id);
        JsonResult jsonResult = new JsonResult(manager);
        return jsonResult;
    }
}
