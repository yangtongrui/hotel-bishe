package com.gp.bishe.service;

import com.gp.bishe.pojo.Manager;
import com.gp.bishe.pojo.ManagerAddress;

import java.util.List;

public interface ManagerService {

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
