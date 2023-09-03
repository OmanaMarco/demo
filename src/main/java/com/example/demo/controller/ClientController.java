package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    ClientService service;
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/client")
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }
    @PutMapping("client/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client) {
        return service.update(id, client);
    }
    @DeleteMapping("client/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/list")
    public List<Client> list(){
        return service.findAll();
    }
}
