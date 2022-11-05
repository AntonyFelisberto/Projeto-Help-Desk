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

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping()
    public ResponseEntity<List<CallDTO>> findById(){
        List<Call> call = callService.findAll();
        List<CallDTO> callDTOs = call.stream().map(calls -> new CallDTO(calls)).collect(Collectors.toList());
        return ResponseEntity.ok().body(callDTOs);
    }

}
