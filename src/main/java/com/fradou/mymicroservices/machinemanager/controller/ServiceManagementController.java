package com.fradou.mymicroservices.machinemanager.controller;

import com.fradou.mymicroservices.machinemanager.service.MachineServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceManagementController {

    private final MachineServicesService machineServicesService;

    @Autowired
    public ServiceManagementController(MachineServicesService machineServicesService) {
        this.machineServicesService = machineServicesService;
    }

    public void lauchService(){
    }
}
