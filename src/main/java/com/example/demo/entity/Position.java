package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@Entity
@Table
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "shortName")
    private String shortName;

    @Column (name = "cipher")
    private String cipher;

    @Min(1)
    @Max(18)
    @Column (name = "lowerDischarge")
    private int lowerDischarge;

    @Min(1)
    @Max(18)
    @Column (name = "upperDischarge")
    private int upperDischarge;

}
