package com.fradou.mymicroservices.machinemanager.service.impl;

import com.fradou.mymicroservices.machinemanager.dao.ServiceDao;
import com.fradou.mymicroservices.machinemanager.service.MachineServicesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineServicesServiceImpl implements MachineServicesService {

    private final ServiceDao serviceDao;

    public MachineServicesServiceImpl(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @Override
    public List<com.fradou.mymicroservices.machinemanager.pojo.Service> getServicesStatus() {
        return serviceDao.findAll();
    }
}
