package com.antony.helpdesk.model;

import com.antony.helpdesk.abstractions.Person;
import com.antony.helpdesk.enums.Profile;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cliente extends Person {

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        addPerfil(Profile.CLIENTE);
    }

    public Cliente(Integer personId, String name, String cpf, String email, String password) {
        super(personId, name, cpf, email, password);
        addPerfil(Profile.CLIENTE);
    }

}
