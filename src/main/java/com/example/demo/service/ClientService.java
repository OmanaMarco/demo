package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired ClientRepository clientRepository;
    public Client save(Client client){
        return clientRepository.save(client);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client update(Long id, Client client) {
        return clientRepository.update(id, client);
    }

    public void delete(Long id) {
    }
}
