package com.antony.helpdesk.model;

import com.antony.helpdesk.abstractions.Person;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Tecnico extends Person {

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
    }

    public Tecnico(Integer personId, String name, String cpf, String email, String password) {
        super(personId, name, cpf, email, password);
    }

}
