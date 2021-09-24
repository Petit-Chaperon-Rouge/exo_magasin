package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Produit;
import fr.semifir.magasin.services.ProduitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("produits")
public class ProduitController {

    private static Logger LOGGER = LoggerFactory.getLogger(ProduitController.class);

    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> findAll() {
        LOGGER.info("Recherche de tout les produits");
        return this.produitService.findAll();
    }

    @GetMapping("{id}")
    public Produit findById(@PathVariable Long id) {
        LOGGER.info("Recherche du produit avec l'id " + id);
        return produitService.findById(id);
    }

    @PostMapping
    public Produit create(@RequestBody Produit produit) {
        LOGGER.info("Creation d'un produit");
        return produitService.create(produit);
    }

    @PutMapping
    public Produit put(@RequestBody Produit produit) {
        return produitService.put(produit);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        produitService.deleteById(id);
    }
}
