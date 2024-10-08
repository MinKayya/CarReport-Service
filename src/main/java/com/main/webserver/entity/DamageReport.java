package com.main.webserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DamageReport {

    @Id
    @GeneratedValue
    private Long id;
    private String damageType;
    private String damageLocation;
    //private int estimateCost; 예정
}
