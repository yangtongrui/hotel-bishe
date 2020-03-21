package com.gp.bishe.service;

import com.gp.bishe.dao.PointsMapper;
import com.gp.bishe.pojo.Points;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PointsServiceImpl implements PointsService {

    @Autowired
    private PointsMapper pointsMapper;
    @Override
    public List<Points> getPointsList() {
        return pointsMapper.getPointsList();
    }

    @Override
    public void insertThings(Points points) {
        pointsMapper.insertThings(points);
    }

    @Override
    public void deleteThingsById(int id) {
        pointsMapper.deleteThingsById(id);
    }

    @Override
    public void updateThings(Points points) {
        pointsMapper.updateThings(points);
    }

    @Override
    public Points selectById(int id) {
        return pointsMapper.selectById(id);
    }
}
