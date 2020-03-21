package com.gp.bishe.Controller;

import com.gp.bishe.constant.Constants;
import com.gp.bishe.pojo.Points;
import com.gp.bishe.service.PointsService;
import com.gp.bishe.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping(value = {"points" })
@RestController
public class PointsController {
    @Autowired
    private PointsService pointsService;
    //列表
    @RequestMapping("/list")
    @ResponseBody
    public JsonResult getPointsList() {
        List<Points> pointsList = pointsService.getPointsList();
        JsonResult jsonResult = new JsonResult(pointsList);
        return jsonResult;
    }
    //添加
    @RequestMapping("insert")
    @ResponseBody
    public JsonResult insertThings(Points points) {
        System.out.println(points.toString());
        if(null == points.getPpic()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_PIC_ERROR, 102);
            return jsonResult;
        }
        if(null == new Double(points.getPprice()) || points.getPprice() <= 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUM_ERROR, 102);
            return jsonResult;
        }
        if(null == points.getPdate()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_DATA_ERROR, 102);
            return jsonResult;
        }
        pointsService.insertThings(points);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_ADD_SUCCESS, 101);
        return jsonResult;
    }
    //删除
    @RequestMapping("delete")
    @ResponseBody
    public JsonResult deleteThingsById(int id){
        System.out.println(id);
        pointsService.deleteThingsById(id);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_DELE_SUCCESS, 101);
        return jsonResult;
    }
    //更改
    @RequestMapping("update")
    @ResponseBody
    public JsonResult updateThings(Points points){
        if(null == points.getPpic()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_PIC_ERROR, 102);
            return jsonResult;
        }
        if(null == new Double(points.getPprice()) || points.getPprice() <= 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUM_ERROR, 102);
            return jsonResult;
        }
        if(null == points.getPdate()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_DATA_ERROR, 102);
            return jsonResult;
        }
        pointsService.updateThings(points);
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_UPDATE_SUCCESS, 101);
        return jsonResult;
    }

    //查找
    @RequestMapping("selectById")
    @ResponseBody
    public JsonResult selectById(int id){
        if(null == new Integer(id)){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SECID_ERROR, 102);
            return jsonResult;
        }
        Points points = pointsService.selectById(id);
        JsonResult jsonResult = new JsonResult(points);
        return jsonResult;
    }

}
