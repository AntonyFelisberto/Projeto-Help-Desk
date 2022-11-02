package com.antony.helpdesk.services;

import com.antony.helpdesk.enums.Priority;
import com.antony.helpdesk.enums.Status;
import com.antony.helpdesk.model.Call;
import com.antony.helpdesk.model.Client;
import com.antony.helpdesk.model.Technical;
import com.antony.helpdesk.repositories.CallRepository;
import com.antony.helpdesk.repositories.ClientRepository;
import com.antony.helpdesk.repositories.TechnicalRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class DataBaseServices {

    private final CallRepository callRepository;

    private final TechnicalRepository technicalRepository;

    private final ClientRepository clientRepository;

    private BCryptPasswordEncoder encoder;

    public void intanciarData(){
        Technical tecnico = new Technical(null,"antony","55557556605","antony@email.com",encoder.encode("1123"));
        tecnico.addPerfil(com.antony.helpdesk.enums.Profile.ADMIN);
        Client client = new Client(null,"linux", "50219923418","artorias@email.com",encoder.encode("artorias"));
        Call call = new Call(null, Priority.MEDIA, Status.ANDAMENTO, "chamado 00","conexao perdida",tecnico,client);
        technicalRepository.saveAll(Arrays.asList(tecnico));
        clientRepository.saveAll(Arrays.asList(client));
        callRepository.saveAll(Arrays.asList(call));
    }

}
