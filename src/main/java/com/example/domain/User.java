package com.example.domain;
import io.micronaut.core.annotation.Introspected;
import java.io.Serializable;
import java.util.Set;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Introspected
@Serdeable.Serializable
@Serdeable.Deserializable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    private String street;
    private String city;
    private String state;
    private String postalCode;

    @OneToMany(mappedBy = "bidder")
    private Set<Bid> bids;

    @OneToMany(mappedBy = "seller")
    private Set<Item> items;
}
