package com.example.products.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CharacteristicKey implements Serializable {
    @Column(name = "product_id")
    private long productId;
    @Column(name = "characteristics_id")
    private long characteristicsId;
}
