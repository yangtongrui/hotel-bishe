package com.gp.bishe.service;

import com.gp.bishe.pojo.Discount;

import java.util.List;

public interface DiscountService {

    List<Discount> getAllDiscountList();

    Discount selectDiscountByid(Integer id);

    void updateDiscount(Discount discount);

    Discount selectDiscountByType(String roomtype);

    void insertDiscount(Discount discount);
}
