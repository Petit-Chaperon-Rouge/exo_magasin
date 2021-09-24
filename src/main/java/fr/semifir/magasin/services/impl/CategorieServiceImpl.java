package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.models.Categorie;
import fr.semifir.magasin.repositories.CategorieRepository;
import fr.semifir.magasin.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository categorieRepository;

    @Autowired
    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> findAll() {
        return this.categorieRepository.findAll();
    }

    @Override
    public Categorie findById(Long id) {
        return this.categorieRepository.findById(id).orElse(null);
    }

    @Override
    public Categorie create(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public Categorie put(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public void deleteById(Long id) {
        this.categorieRepository.deleteById(id);
    }
}
