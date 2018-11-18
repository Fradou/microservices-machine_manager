package com.fradou.mymicroservices.machinemanager.controller;

import com.fradou.mymicroservices.machinemanager.pojo.Service;
import com.fradou.mymicroservices.machinemanager.service.MachineServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("service-manager")
public class ServiceManagementController {

    private final MachineServicesService machineServicesService;

    @Autowired
    public ServiceManagementController(MachineServicesService machineServicesService) {
        this.machineServicesService = machineServicesService;
    }

    @GetMapping
    public List<Service> getServicesStatus(){
        return machineServicesService.getServicesStatus();
    }
}
