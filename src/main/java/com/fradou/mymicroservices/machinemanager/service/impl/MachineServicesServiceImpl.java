package com.fradou.mymicroservices.machinemanager.service.impl;

import com.fradou.mymicroservices.fwk.exception.BusinessException;
import com.fradou.mymicroservices.machinemanager.dao.ServiceDao;
import com.fradou.mymicroservices.machinemanager.pojo.OperatingSystem;
import com.fradou.mymicroservices.machinemanager.pojo.Operation;
import com.fradou.mymicroservices.machinemanager.service.MachineServicesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class MachineServicesServiceImpl implements MachineServicesService {

    private final ServiceDao serviceDao;

    public MachineServicesServiceImpl(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @Override
    public List<com.fradou.mymicroservices.machinemanager.pojo.Service> getServicesStatus() {

        return serviceDao.findAll();
    }

    @Override
    public void runCmd(Service service, Operation operation) {

        String cmd = operation.getCommand();
        try {
            Process p = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private OperatingSystem getOs() {

            String os = System.getProperty("os.name").toLowerCase();
            return OperatingSystem.valueOf(os);
    }
}
