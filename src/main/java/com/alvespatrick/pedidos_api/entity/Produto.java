package com.alvespatrick.pedidos_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

    private UUID id =  UUID.randomUUID();
    private String nome;
    private Double valor;
}
