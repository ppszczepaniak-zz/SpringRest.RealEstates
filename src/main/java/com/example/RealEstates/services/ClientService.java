package com.example.RealEstates.services;

import com.example.RealEstates.models.Client;
import com.example.RealEstates.repositories.ClientRepository;

import java.util.List;

public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Client get(int id) {
        return clientRepository.findbyId(id);
    }

    public Client create(Client client) {
        return clientRepository.add(client);
    }


    public Client update(int id, Client client) {
        return clientRepository.updateById(id, client);
    }

    public void delete(int id) {
        clientRepository.deleteById(id);
    }
}
