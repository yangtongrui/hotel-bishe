package com.gp.bishe.dao;

import com.gp.bishe.pojo.Discount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscountMapper {
    List<Discount> getAllDiscountList();

    Discount selectDiscountByid(Integer id);

    void updateDiscount(Discount discount);

    Discount selectDiscountByType(String roomtype);

    void insertDiscount(Discount discount);
}
