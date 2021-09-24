package fr.semifir.magasin.repositories;

import fr.semifir.magasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {}
