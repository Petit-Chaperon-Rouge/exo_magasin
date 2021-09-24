package fr.semifir.magasin.repositories;

import fr.semifir.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {}
