package com.doz;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
public class Rechnung {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private long id;
}
