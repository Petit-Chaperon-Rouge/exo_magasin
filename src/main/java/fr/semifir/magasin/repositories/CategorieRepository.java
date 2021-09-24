package fr.semifir.magasin.repositories;

import fr.semifir.magasin.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {}
