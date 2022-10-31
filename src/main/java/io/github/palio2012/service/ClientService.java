package io.github.palio2012.service;

import io.github.palio2012.model.Client;
import io.github.palio2012.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService (ClientRepository repository) {
        this.repository = repository;
    }

    public void saveClient (Client client) {
        clientCheck(client);
        this.repository.persist(client);
    }

    public void clientCheck (Client client) {
        // aplica validações
    }
}
