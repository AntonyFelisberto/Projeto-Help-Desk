package com.antony.helpdesk.model;

import com.antony.helpdesk.abstractions.Person;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Technical extends Person {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @OneToMany(mappedBy = "tecnico")
    private List<Call> chamados = new ArrayList<>();

    public Technical() {
        super();
    }

    public Technical(Integer personId, String name, String cpf, String email, String password) {
        super(personId, name, cpf, email, password);
    }

}
