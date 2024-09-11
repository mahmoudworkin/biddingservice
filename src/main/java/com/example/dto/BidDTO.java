package com.example.dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Introspected
@Serdeable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BidDTO {
    private Long id;
    private Double amount;
    private String bidTime;
    private Long userId;
    private Long itemId;
}
