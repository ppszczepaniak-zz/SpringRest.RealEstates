package com.example.RealEstates.controllers;

import com.example.RealEstates.models.Client;
import com.example.RealEstates.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("") //localhost:9999/client
    public List<Client> getClients() {
        return clientService.getAll();
    }

    @GetMapping("/{id}") //localhost:9999/client/XX <- you fill in XX
    public Client getClient(@PathVariable("id") int id) {
        return clientService.get(id);
    }

    @PostMapping("/create") //localhost:9999/client/create
    @ResponseStatus(HttpStatus.CREATED) //gives this status
    public Client createClient(@RequestBody Client client) {
        return clientService.create(client);
    }

    @PutMapping("/{id}") //localhost:9999/client/XX <- you fill in XX
    public Client updateClient(@PathVariable("id") int id, @RequestBody Client client) {
        return clientService.update(id, client);
    }

    @DeleteMapping("/{id}") //localhost:9999/client/XX <- you fill in XX
    public String deleteClient(@PathVariable("id") int id) {
        clientService.delete(id);
        return "OK - client deleted.";
    }
}

