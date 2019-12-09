package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String FIO;

    @Max(60)
    @Min(18)
    private int age;

    @Column//If name of the column in db match to the name of property in class, there is no need for this annotation
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    }, fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private Position position;

}
