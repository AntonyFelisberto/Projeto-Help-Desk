package com.antony.helpdesk.controller;

import com.antony.helpdesk.dto.TechnicalDTO;
import com.antony.helpdesk.model.Technical;
import com.antony.helpdesk.services.TechnicalServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/technical")
public class TechnicalResources {

    private TechnicalServices technicalServices;

    @GetMapping(value = "/{id}")
    public ResponseEntity<TechnicalDTO> findById(@PathVariable Integer id){
        Technical technical = technicalServices.findById(id);
        return ResponseEntity.ok().body(new TechnicalDTO(technical));
    }

}
