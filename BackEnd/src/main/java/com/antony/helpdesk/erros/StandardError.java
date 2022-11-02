package com.antony.helpdesk.erros;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class StandardError {

    private Long timestamp;
    private String status;
    private String message;

}
