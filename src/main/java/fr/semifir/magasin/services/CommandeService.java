package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Commande;

import java.util.List;

public interface CommandeService {

    List<Commande> findAll();
    Commande findById(Long id);
    Commande create(Commande commande);
    Commande put(Commande commande);
    void deleteById(Long id);

}
