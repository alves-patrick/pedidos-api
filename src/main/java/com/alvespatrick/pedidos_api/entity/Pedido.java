package com.alvespatrick.pedidos_api.entity;

import com.alvespatrick.pedidos_api.entity.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    private UUID id =  UUID.randomUUID();
    private String cliente;
    private List<ItemPedido> itens = Arrays.asList();
    private Double valorTotal;
    private String emailNotificacao;
    private Status status =  Status.EM_PROCESSAMENTO;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora = LocalDateTime.now();
}
