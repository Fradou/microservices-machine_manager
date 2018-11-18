package com.fradou.mymicroservices.machinemanager.dao;

import com.fradou.mymicroservices.machinemanager.pojo.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDao extends JpaRepository<Service, Integer> {
}
