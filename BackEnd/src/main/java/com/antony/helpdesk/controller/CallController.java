package com.antony.helpdesk.controller;

import com.antony.helpdesk.dto.CallDTO;
import com.antony.helpdesk.model.Call;
import com.antony.helpdesk.services.CallService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calls")
@AllArgsConstructor
public class CallController {

    private CallService callService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CallDTO> findById(@PathVariable Integer id){
        Call call = callService.findById(id);
        return ResponseEntity.ok().body(new CallDTO(call));
    }

}
