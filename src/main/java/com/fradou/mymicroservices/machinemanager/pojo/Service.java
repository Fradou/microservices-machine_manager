package com.fradou.mymicroservices.machinemanager.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_services_srv")
public class Service {

    @Id
    @Column(name = "srv_id")
    private long id;

    private String name;
}
