package com.example.domain;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "bids")
@Introspected
@Serdeable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bid implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String bidTime;

    //@ManyToOne(/*fetch = FetchType.LAZY*/)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User bidder;

    //@ManyToOne(/*fetch = FetchType.LAZY*/)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "item_id")
    private Item item;

    // Getters and Setters
}
