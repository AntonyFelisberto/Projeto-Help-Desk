package com.antony.helpdesk.services;

import com.antony.helpdesk.exceptions.NotFoundException;
import com.antony.helpdesk.model.Call;
import com.antony.helpdesk.repositories.CallRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CallService {

    private CallRepository callRepository;

    public Call findById(Integer id) {
        Optional<Call> chamado = callRepository.findById(id);
        return chamado.orElseThrow(() -> new NotFoundException("Chamado não encontrado com id: " + id));
    }

}
