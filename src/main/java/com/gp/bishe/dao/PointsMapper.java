package com.gp.bishe.dao;

import com.gp.bishe.pojo.Points;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PointsMapper {
    List<Points> getPointsList();

    void insertThings(Points points);

    void deleteThingsById(int id);

    void updateThings(Points points);

    Points selectById(int id);
}
