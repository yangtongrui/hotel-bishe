package com.gp.bishe.Controller;

import com.gp.bishe.constant.Constants;
import com.gp.bishe.pojo.Discount;
import com.gp.bishe.service.DiscountService;
import com.gp.bishe.vo.JsonResult;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@Controller
@RequestMapping(value = {"discount" })
public class DiscountController {
    @Autowired
    private DiscountService discountService;
    //折扣列表
    @RequestMapping("/list")
    @ResponseBody
    public JsonResult getDiscountList(){
        List<Discount> discountList = discountService.getAllDiscountList();
        JsonResult jsonResult = new JsonResult(discountList);
        return  jsonResult;
    }
    //查找
    @RequestMapping("/select")
    @ResponseBody
    public JsonResult selectDiscountByid(Integer id){
        System.out.println(id);
        if (null == id) {
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_SECID_ERROR, 102);
            return jsonResult;
        }
        Discount discount = discountService.selectDiscountByid(id);
        JsonResult jsonResult = new JsonResult(discount);
        return jsonResult;
    }

    //更改信息
    @RequestMapping("/update")
    @ResponseBody
    public JsonResult updateDiscountByid( Discount discount,HttpServletRequest rep ) throws InvocationTargetException, IllegalAccessException {
        Map<String, String[]> parameterMap = rep.getParameterMap();
        BeanUtils.populate(discount,parameterMap);
        Double nordiscountweek = new Double(discount.getNordiscountweek());
        Double nordiscountmonth = new Double(discount.getNordiscountmonth());
        Double nordiscountseason = new Double(discount.getNordiscountseason());
        Double nordiscounthalfyear = new Double(discount.getNordiscounthalfyear());
        Double nordiscountyear = new Double(discount.getNordiscountyear());
        Double vipdiscountweek = new Double(discount.getVipdiscountweek());
        Double vipdiscountmonth = new Double(discount.getVipdiscountmonth());
        Double vipdiscountaeason = new Double(discount.getVipdiscountseason());
        Double vipdiscounthalfyear = new Double(discount.getVipdiscounthalfyear());
        Double vipdiscountyear = new Double(discount.getVipdiscountyear());
        if(null == nordiscountweek || discount.getNordiscountweek() >= 10 || discount.getNordiscountweek() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscountmonth || discount.getNordiscountmonth() >= 10 || discount.getNordiscountmonth() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscountseason || discount.getNordiscountseason() >= 10 || discount.getNordiscountseason() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscounthalfyear || discount.getNordiscounthalfyear() >= 10 || discount.getNordiscounthalfyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscountyear || discount.getNordiscountyear() >= 10 || discount.getNordiscountyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountweek || discount.getVipdiscountweek() >= 10 || discount.getVipdiscountweek() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountmonth || discount.getVipdiscountmonth() >= 10 || discount.getVipdiscountmonth() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountaeason || discount.getVipdiscountseason() >= 10 || discount.getVipdiscountseason() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscounthalfyear || discount.getNordiscounthalfyear() >= 10 || discount.getNordiscounthalfyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountyear || discount.getVipdiscountyear() >= 10 || discount.getVipdiscountyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        discountService.updateDiscount(discount);
        System.out.println(discount.toString());
        JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_UPDATE_SUCCESS, 101);
        return jsonResult;
    }
    //添加
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult insertDiscount(Discount discount, HttpServletRequest req) throws InvocationTargetException, IllegalAccessException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        BeanUtils.populate(discount,parameterMap);
         Double nordiscountweek = new Double(discount.getNordiscountweek());
        Double nordiscountmonth = new Double(discount.getNordiscountmonth());
        Double nordiscountseason = new Double(discount.getNordiscountseason());
        Double nordiscounthalfyear = new Double(discount.getNordiscounthalfyear());
        Double nordiscountyear = new Double(discount.getNordiscountyear());
        Double vipdiscountweek = new Double(discount.getVipdiscountweek());
        Double vipdiscountmonth = new Double(discount.getVipdiscountmonth());
        Double vipdiscountaeason = new Double(discount.getVipdiscountseason());
        Double vipdiscounthalfyear = new Double(discount.getVipdiscounthalfyear());
        Double vipdiscountyear = new Double(discount.getVipdiscountyear());
        if(null == nordiscountweek || discount.getNordiscountweek() >= 10 || discount.getNordiscountweek() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscountmonth || discount.getNordiscountmonth() >= 10 || discount.getNordiscountmonth() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscountseason || discount.getNordiscountseason() >= 10 || discount.getNordiscountseason() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscounthalfyear || discount.getNordiscounthalfyear() >= 10 || discount.getNordiscounthalfyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == nordiscountyear || discount.getNordiscountyear() >= 10 || discount.getNordiscountyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountweek || discount.getVipdiscountweek() >= 10 || discount.getVipdiscountweek() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountmonth || discount.getVipdiscountmonth() >= 10 || discount.getVipdiscountmonth() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountaeason || discount.getVipdiscountseason() >= 10 || discount.getVipdiscountseason() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscounthalfyear || discount.getNordiscounthalfyear() >= 10 || discount.getNordiscounthalfyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == vipdiscountyear || discount.getVipdiscountyear() >= 10 || discount.getVipdiscountyear() < 0){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_NUMB_ERROR, 102);
            return jsonResult;
        }
        if(null == discount.getRoomtype()){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.NO_TYPE_ERROR, 102);
            return jsonResult;
        }
        Discount discountByType = discountService.selectDiscountByType(discount.getRoomtype());
        if(discountByType != null){
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.YEY_TYPE_ERROR, 102);
            return jsonResult;
        }else{
            discountService.insertDiscount(discount);
            JsonResult jsonResult = new JsonResult(null, Constants.MessageStr.MSG_ADD_SUCCESS, 101);
            return jsonResult;
        }

    }

}
