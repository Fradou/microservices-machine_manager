package com.fradou.mymicroservices.machinemanager.utils;

import com.fradou.mymicroservices.machinemanager.dao.OperationDao;
import com.fradou.mymicroservices.machinemanager.dao.ServiceDao;
import com.fradou.mymicroservices.machinemanager.pojo.Operation;
import com.fradou.mymicroservices.machinemanager.pojo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultDataLoader implements CommandLineRunner {

    private final ServiceDao serviceDao;

    @Autowired
    public DefaultDataLoader(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Operation> operationList = new ArrayList<>();
        operationList.add(new Operation(null, "Start", null));
        Service service = Service.builder().name("Apache2").operations(operationList).build();

        serviceDao.save(service);
    }
}
