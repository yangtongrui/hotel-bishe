package com.gp.bishe.service;

import com.gp.bishe.dao.DiscountMapper;
import com.gp.bishe.pojo.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountSercieImpl implements DiscountService{
    @Autowired
    private DiscountMapper discountMapper;

    @Override
    public List<Discount> getAllDiscountList() {
        return discountMapper.getAllDiscountList();
    }

    @Override
    public Discount selectDiscountByid(Integer id) {
        return discountMapper.selectDiscountByid(id);
    }

    @Override
    public void updateDiscount(Discount discount) {
        discountMapper.updateDiscount(discount);
    }

    @Override
    public Discount selectDiscountByType(String roomtype) {
        return discountMapper.selectDiscountByType(roomtype);
    }

    @Override
    public void insertDiscount(Discount discount) {
        discountMapper.insertDiscount(discount);
    }
}
