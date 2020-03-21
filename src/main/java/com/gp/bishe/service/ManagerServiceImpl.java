package com.gp.bishe.service;

import com.gp.bishe.dao.ManagerMapper;
import com.gp.bishe.pojo.Manager;
import com.gp.bishe.pojo.ManagerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public List<Manager> getManagerList() {
        return managerMapper.getManagerList();
    }

    @Override
    public Manager selectManagerByName(String managername) {
        return managerMapper.selectManagerByName(managername);
    }

    @Override
    public void insertManager(Manager manager) {
        managerMapper.insertManager(manager);
    }

    @Override
    public Manager login(String managername) {
        return managerMapper.login(managername);
    }

    @Override
    public void deleteManagerById(Integer id) {
        managerMapper.deleteManagerById(id);
    }

    @Override
    public void changePwd(Manager manager) {
        managerMapper.changePwd(manager);
    }

    @Override
    public void updateMessage(Manager manager) {
        managerMapper.updateMessage(manager);
    }

    @Override
    public void updateAddressA(ManagerAddress managerAddress) {
        managerMapper.updateAddressA(managerAddress);
    }

    @Override
    public void updateAddressB(ManagerAddress managerAddress) {
        managerMapper.updateAddressB(managerAddress);
    }

    @Override
    public void updateAddressC(ManagerAddress managerAddress) {
        managerMapper.updateAddressC(managerAddress);
    }

    @Override
    public void insertAddressID(int managerid) {
        managerMapper.insertAddressID(managerid);
    }

    @Override
    public ManagerAddress selectById(int managerid) {
        return managerMapper.selectById(managerid);
    }

    @Override
    public Manager selectbyId(int id) {
        return managerMapper.selectbyId(id);
    }


}
