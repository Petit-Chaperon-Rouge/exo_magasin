package fr.semifir.magasin;

import fr.semifir.magasin.repositories.ProduitRepository;
import fr.semifir.magasin.services.ProduitService;
import fr.semifir.magasin.services.impl.ProduitServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProduitService produitService(ProduitRepository produitRepository) {
        return new ProduitServiceImpl(produitRepository);
    }

}
