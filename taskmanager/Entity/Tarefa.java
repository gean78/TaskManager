package com.example.taskmanager.Entity;

import ch.qos.logback.core.status.Status;
import com.example.taskmanager.Entity.Enum.Prioridade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeVencimento;
    private Status status;
    private Prioridade prioridade;
    private String responsavel;
    private LocalDateTime dataDeCriacao;
    private LocalDateTime dataDeFinalizacao;

}
