package com.gp.bishe.dao;

import com.gp.bishe.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
    List<Room> getAllRoomList();

    void updateRoom(Room room);

    void deleteRoomById(Integer roomid);

    void insertRoom(Room room);

    Room selectRoomByid(Integer roomid);

    void updatePriceRoom(Room room);
}
