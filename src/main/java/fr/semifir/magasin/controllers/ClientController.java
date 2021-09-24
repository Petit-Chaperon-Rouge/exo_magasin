package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Client;
import fr.semifir.magasin.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

    private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> findAll() {
        LOGGER.info("Recherche de tout les clients");
        return this.clientService.findAll();
    }

    @GetMapping("{id}")
    public Client findById(@PathVariable Long id) {
        LOGGER.info("Recherche du client avec l'id " + id);
        return clientService.findById(id);
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        LOGGER.info("Creation d'un client");
        return clientService.create(client);
    }

    @PutMapping
    public Client put(@RequestBody Client client) {
        return clientService.put(client);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}