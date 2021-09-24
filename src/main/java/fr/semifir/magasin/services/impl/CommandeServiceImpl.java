package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.models.Commande;
import fr.semifir.magasin.repositories.CommandeRepository;
import fr.semifir.magasin.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeRepository;

    @Autowired
    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> findAll() {
        return this.commandeRepository.findAll();
    }

    @Override
    public Commande findById(Long id) {
        return this.commandeRepository.findById(id).orElse(null);
    }

    @Override
    public Commande create(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public Commande put(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public void deleteById(Long id) {
        this.commandeRepository.deleteById(id);
    }
}
