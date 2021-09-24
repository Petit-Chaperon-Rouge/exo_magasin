package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Produit;

import java.util.List;

public interface ProduitService {

    List<Produit> findAll();
    Produit findById(Long id);
    Produit create(Produit produit);
    Produit put(Produit produit);
    void deleteById(Long id);

}
