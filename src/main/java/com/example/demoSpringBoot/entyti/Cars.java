package com.example.demoSpringBoot.entyti;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String carName;
    private String carColor;
    private String personId;

    public Cars() {
    }

    public Cars(String carName, String carColor, String personId) {
        this.carName = carName;
        this.carColor = carColor;
        this.personId = personId;
    }

}
