package com.example.products.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "characteristic")
public class Characteristic {
    @Id
    private UUID id;
    private UUID productId;
    private UUID characteristicsId;
    private String value;
}
