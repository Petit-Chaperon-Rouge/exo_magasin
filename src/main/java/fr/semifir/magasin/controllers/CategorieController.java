package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Categorie;
import fr.semifir.magasin.services.CategorieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategorieController {

    private static Logger LOGGER = LoggerFactory.getLogger(CategorieController.class);

    @Autowired
    private CategorieService categorieService;

    @GetMapping
    public List<Categorie> findAll() {
        LOGGER.info("Recherche de tout les categories");
        return this.categorieService.findAll();
    }

    @GetMapping("{id}")
    public Categorie findById(@PathVariable Long id) {
        LOGGER.info("Recherche du categorie avec l'id " + id);
        return categorieService.findById(id);
    }

    @PostMapping
    public Categorie create(@RequestBody Categorie categorie) {
        LOGGER.info("Creation d'un categorie");
        return categorieService.create(categorie);
    }

    @PutMapping
    public Categorie put(@RequestBody Categorie categorie) {
        return categorieService.put(categorie);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }
}
