package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.models.Produit;
import fr.semifir.magasin.repositories.ProduitRepository;
import fr.semifir.magasin.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;

    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> findAll() {
        return this.produitRepository.findAll();
    }

    @Override
    public Produit findById(Long id) {
        return this.produitRepository.findById(id).orElse(null);
    }

    @Override
    public Produit create(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public Produit put(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public void deleteById(Long id) {
        this.produitRepository.deleteById(id);
    }
}
