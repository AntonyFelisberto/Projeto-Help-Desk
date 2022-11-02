package com.antony.helpdesk.config;

import com.antony.helpdesk.services.DataBaseServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("dev")
@AllArgsConstructor
public class Config {

    private DataBaseServices dataBaseServices;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String value;

    @Bean
    public boolean intanciarData(){
        if(value.equals("create") || value.equals("update")){
            dataBaseServices.intanciarData();
        }
        return false;
    }

}
