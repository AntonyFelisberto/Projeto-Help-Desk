package com.antony.helpdesk.dto;

import com.antony.helpdesk.enums.Status;
import com.antony.helpdesk.model.Call;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

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
    private Integer priority;
    private Status status;
    private String title;
    private String observations;
    private Integer tecnico;
    private Integer cliente;
    private String nameTechnical;
    private String nameClient;

    public CallDTO(Call chamado) {
        super();
        this.id = chamado.getId();
        this.dateOpening = chamado.getDateOpening();
        this.dateClosed = chamado.getDateClosed();
        this.priority = chamado.getPriority().getId();
        this.status = chamado.getStatus();
        this.title = chamado.getTitle();
        this.observations = chamado.getObservations();
        this.tecnico = chamado.getTecnico().getPersonId();
        this.nameTechnical = chamado.getTecnico().getName();
        this.cliente = chamado.getCliente().getPersonId();
        this.nameClient = chamado.getCliente().getName();
    }

}
