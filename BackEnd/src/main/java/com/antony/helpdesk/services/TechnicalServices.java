package com.antony.helpdesk.services;

import com.antony.helpdesk.exceptions.NotFoundException;
import com.antony.helpdesk.model.Technical;
import com.antony.helpdesk.repositories.TechnicalRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TechnicalServices {

    private TechnicalRepository technicalRepository;



    public Technical findById(Integer id){
        return technicalRepository.findById(id).orElseThrow(() -> new NotFoundException("Objeto não encontrado pelo id: "+id));
    }

}
