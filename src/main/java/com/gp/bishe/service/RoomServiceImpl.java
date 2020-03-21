package com.gp.bishe.service;


import com.gp.bishe.dao.RoomMapper;
import com.gp.bishe.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;
    @Override
    public List<Room> getAllRoomList() {
        return roomMapper.getAllRoomList();
    }

    @Override
    public void updateRoom(Room room) {
         roomMapper.updateRoom(room);
    }

    @Override
    public void deleteRoomById(Integer roomid) {
        roomMapper.deleteRoomById(roomid);
    }

    @Override
    public void insertRoom(Room room) {
        roomMapper.insertRoom(room);
    }

    @Override
    public Room selectRoomByid(Integer roomid) {
        return roomMapper.selectRoomByid(roomid);
    }

    @Override
    public void updatePriceRoom(Room room) {
         roomMapper.updatePriceRoom(room);
    }
}
