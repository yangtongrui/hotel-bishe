package com.gp.bishe.service;

import com.gp.bishe.pojo.Points;

import java.util.List;

public interface PointsService {
    List<Points> getPointsList();

    void insertThings(Points points);

    void deleteThingsById(int id);

    void updateThings(Points points);

    Points selectById(int id);
}
