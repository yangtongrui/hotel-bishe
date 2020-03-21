package com.gp.bishe.service;


import com.gp.bishe.pojo.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRoomList();

    void updateRoom(Room room);

    void deleteRoomById(Integer roomid);

    void insertRoom(Room room);

    Room selectRoomByid(Integer roomid);

    void updatePriceRoom(Room room);
}
