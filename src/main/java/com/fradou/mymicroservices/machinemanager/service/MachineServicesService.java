package com.fradou.mymicroservices.machinemanager.service;

import com.fradou.mymicroservices.machinemanager.pojo.Service;

import java.util.List;

public interface MachineServicesService {
    List<Service> getServicesStatus();
}
