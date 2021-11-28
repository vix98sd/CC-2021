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
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "person_generator"
    )
    private Integer id;
    private String method;
    private String endpoint;
    private Long count;

    public void increaseCounter(){
        this.count++;
    }
}
