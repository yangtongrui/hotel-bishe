package com.gp.bishe.Controller;

import com.alibaba.fastjson.JSON;
import com.gp.bishe.constant.Constants;
import com.gp.bishe.pojo.Room;
import com.gp.bishe.service.RoomService;
import com.gp.bishe.vo.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import org.apache.commons.beanutils.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;
    //房间列表
    @RequestMapping("/roomlist")
    @ResponseBody
    public JsonResult getRoomList(){
        List<Room> roomList = roomService.getAllRoomList();
        JsonResult jsonResult = new JsonResult(roomList);
        return  jsonResult;
    }
    //查看
    @RequestMapping("/roomselect")
    @ResponseBody
    public JsonResult selectRoomByid(Integer id){
        if (null == id) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SECID_ERROR, 102);
            return jsonResult;
        }
        Room  room = roomService.selectRoomByid(id);
        JsonResult jsonResult = new JsonResult(room);
        return jsonResult;
    }
    
    //更改信息
    @RequestMapping("/roomupdate")
    @ResponseBody
    public JsonResult updateRoomByid( Room room,HttpServletRequest rep ) throws InvocationTargetException, IllegalAccessException {
        Map<String, String[]> parameterMap = rep.getParameterMap();
        BeanUtils.populate(room,parameterMap);

        if(null == room.getRoomdate()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_DATA_ERROR, 102);
            return jsonResult;
        }
        if(null == room.getRoomtype()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_TYPE_ERROR, 102);
            return jsonResult;
        }
        if(null == room.getRoompic()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_PIC_ERROR, 102);
            return jsonResult;
        }
        if(0 >= room.getRoomsize()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SIZE_ERROR, 102);
            return jsonResult;
        }
        if(null == room.getRoomthings()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_THING_ERROR, 102);
            return jsonResult;
        }
        roomService.updateRoom(room);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_UPDATE_SUCCESS, 101);
        return jsonResult;
    }
    //更改价格
    @RequestMapping("/roompriceupdate")
    @ResponseBody
    public JsonResult updatePriceRoomByid( Room room,HttpServletRequest rep ) throws InvocationTargetException, IllegalAccessException {
        Map<String, String[]> parameterMap = rep.getParameterMap();
        BeanUtils.populate(room,parameterMap);
        Double ordprice = new Double(room.getOrdprice());
        if(null == ordprice ||room.getOrdprice() <= 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUM_ERROR, 102);
            return jsonResult;
        }
        Double vipprice = new Double(room.getVipprice());
        if(null == vipprice || room.getVipprice() <= 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUM_ERROR, 102);
            return jsonResult;
        }
        Double deposit = new Double(room.getDeposit());
        if(null == deposit || room.getDeposit() <= 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUM_ERROR, 102);
            return jsonResult;
        }
        roomService.updatePriceRoom(room);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_UPDATE_SUCCESS, 101);
        return jsonResult;
    }
    //删除
    @RequestMapping("/roomdelete")
    @ResponseBody
    public JsonResult deleteRoomByid(Integer id)  {
        if (null == id) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SECID_ERROR, 102);
            return jsonResult;
        }
        roomService.deleteRoomById(id);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_DELE_SUCCESS, 101);
        return jsonResult;
    }
    //添加
    @RequestMapping("/roominsert")
    @ResponseBody
    public JsonResult insertRoom( Room room, HttpServletRequest req) throws InvocationTargetException, IllegalAccessException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        BeanUtils.populate(room,parameterMap);
        if(null == room.getRoomdate()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_DATA_ERROR, 102);
            return jsonResult;
        }
        if(null == room.getRoomtype()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_TYPE_ERROR, 102);
            return jsonResult;
        }
        if(null == room.getRoompic()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_PIC_ERROR, 102);
            return jsonResult;
        }
        if(0 >= room.getRoomsize()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SIZE_ERROR, 102);
            return jsonResult;
        }
        if(null == room.getRoomthings()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_THING_ERROR, 102);
            return jsonResult;
        }
        roomService.insertRoom(room);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_ADD_SUCCESS, 101);
        return jsonResult;
        }
}
