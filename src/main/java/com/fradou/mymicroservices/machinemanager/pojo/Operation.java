package com.fradou.mymicroservices.machinemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "t_operations_ope")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Operation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ope_id")
    private Integer id;

    @Column(name = "ope_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "srv_id")
    @NotNull
    private Service service;
}
