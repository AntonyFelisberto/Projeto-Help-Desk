package com.antony.helpdesk.dto;

import com.antony.helpdesk.enums.Status;
import com.antony.helpdesk.model.Call;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class CallDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDate dateOpening = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDate dateClosed;
    @NotNull(message = "prioridade é requerida")
    private Integer priority;
    @NotNull(message = "estatus é requerido")
    private Integer status;
    @NotNull(message = "titulo é requerido")
    private String title;
    @NotNull(message = "observações é requerido")
    private String observations;
    @NotNull(message = "tecnico é requerido")
    private Integer tecnico;
    @NotNull(message = "cliente é requerido")
    private Integer cliente;
    private String nameTechnical;
    private String nameClient;

    public CallDTO(Call chamado) {
        super();
        this.id = chamado.getId();
        this.dateOpening = chamado.getDateOpening();
        this.dateClosed = chamado.getDateClosed();
        this.priority = chamado.getPriority().getId();
        this.status = chamado.getStatus().getId();
        this.title = chamado.getTitle();
        this.observations = chamado.getObservations();
        this.tecnico = chamado.getTecnico().getPersonId();
        this.nameTechnical = chamado.getTecnico().getName();
        this.cliente = chamado.getCliente().getPersonId();
        this.nameClient = chamado.getCliente().getName();
    }

}
