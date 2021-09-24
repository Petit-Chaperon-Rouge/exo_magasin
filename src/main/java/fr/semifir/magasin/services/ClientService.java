package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();
    Client findById(Long id);
    Client create(Client client);
    Client put(Client client);
    void deleteById(Long id);
    
}
