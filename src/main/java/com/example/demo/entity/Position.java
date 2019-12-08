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
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String shortName;
    private String cipher;

    @Min(1)
    @Max(18)
    private int lowerDischarge;

    @Min(1)
    @Max(18)
    private int upperDischarge;

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", cipher='" + cipher + '\'' +
                ", lowerDischarge=" + lowerDischarge +
                ", upperDischarge=" + upperDischarge +
                '}';
    }
}
