package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "history_of_displacements")
public class HistoryOfDisplacements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    }, fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private Position position;

    @Column (name = "start_of_work")
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private Date startOfWork;

    @Column (name = "end_of_work")
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private Date endOfWork;
}
