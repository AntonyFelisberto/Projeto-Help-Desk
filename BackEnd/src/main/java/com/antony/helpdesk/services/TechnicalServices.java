package com.antony.helpdesk.services;

import com.antony.helpdesk.model.Technical;
import com.antony.helpdesk.repositories.TechnicalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TechnicalServices {

    private TechnicalRepository technicalRepository;

    public Technical findById(Integer id){
        return technicalRepository.findById(id).orElse(null);
    }

}
