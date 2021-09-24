package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Categorie;

import java.util.List;

public interface CategorieService {

    List<Categorie> findAll();
    Categorie findById(Long id);
    Categorie create(Categorie categorie);
    Categorie put(Categorie categorie);
    void deleteById(Long id);
    
}
