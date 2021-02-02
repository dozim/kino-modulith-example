package com.doz.business;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
public class Programm {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private long id;

    public Programm(long id) {
        this.id = id;
    }
}
