package fr.semifir.magasin.repositories;

import fr.semifir.magasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {}
