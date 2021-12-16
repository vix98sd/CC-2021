package com.cloud.webapp.model;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "Counter")
@Table(name = "counters")
public class Counter {
    @Id
    @SequenceGenerator(
            name = "counter_sequence",
            sequenceName = "counter_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "counter_sequence"
    )
    private Integer id;
    private String method;
    private String endpoint;
    private Long count;

    public void increaseCounter(){
        this.count++;
    }
}
