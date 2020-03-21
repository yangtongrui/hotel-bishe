package com.gp.bishe.dao;

import com.gp.bishe.pojo.Manager;
import com.gp.bishe.pojo.ManagerAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ManagerMapper {

    List<Manager> getManagerList();

    Manager selectManagerByName(String managername);

    void insertManager(Manager manager);


    Manager login(String managername);

    void deleteManagerById(Integer id);

    void changePwd(Manager manager);

    void updateMessage(Manager manager);

    void updateAddressA(ManagerAddress managerAddress);

    void updateAddressB(ManagerAddress managerAddress);

    void updateAddressC(ManagerAddress managerAddress);

    void insertAddressID(int managerid);

    ManagerAddress selectById(int managerid);

    Manager selectbyId(int id);
}
