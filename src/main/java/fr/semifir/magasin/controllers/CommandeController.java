package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Commande;
import fr.semifir.magasin.services.CommandeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

    private static Logger LOGGER = LoggerFactory.getLogger(CommandeController.class);

    @Autowired
    private CommandeService commandeService;

    @GetMapping
    public List<Commande> findAll() {
        LOGGER.info("Recherche de tout les commandes");
        return this.commandeService.findAll();
    }

    @GetMapping("{id}")
    public Commande findById(@PathVariable Long id) {
        LOGGER.info("Recherche du commande avec l'id " + id);
        return commandeService.findById(id);
    }

    @PostMapping
    public Commande create(@RequestBody Commande commande) {
        LOGGER.info("Creation d'un commande");
        return commandeService.create(commande);
    }

    @PutMapping
    public Commande put(@RequestBody Commande commande) {
        return commandeService.put(commande);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        commandeService.deleteById(id);
    }
}