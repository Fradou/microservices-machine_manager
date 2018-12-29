package com.fradou.mymicroservices.machinemanager.service;

import com.fradou.mymicroservices.machinemanager.pojo.Operation;
import com.fradou.mymicroservices.machinemanager.pojo.Service;

import java.util.List;

/**
 * Service for machine service management. Allow operation and cmd to be runned
 */
public interface MachineServicesService {

    List<Service> getServicesStatus();

    void runCmd(org.springframework.stereotype.Service service, Operation operation);
}
