package com.fradou.mymicroservices.machinemanager.dao;

import com.fradou.mymicroservices.machinemanager.pojo.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDao extends JpaRepository<Operation, Integer> {
}
