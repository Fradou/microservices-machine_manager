package com.fradou.mymicroservices.machinemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "t_services_srv")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Service {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "srv_id")
    private Integer id;

    @Column(name = "srv_name")
    private String name;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<Operation> operations;
}
