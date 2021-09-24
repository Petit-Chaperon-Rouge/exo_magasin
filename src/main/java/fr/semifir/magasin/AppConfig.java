package fr.semifir.magasin;

import fr.semifir.magasin.repositories.CategorieRepository;
import fr.semifir.magasin.repositories.ClientRepository;
import fr.semifir.magasin.repositories.ProduitRepository;
import fr.semifir.magasin.services.CategorieService;
import fr.semifir.magasin.services.ClientService;
import fr.semifir.magasin.services.ProduitService;
import fr.semifir.magasin.services.impl.CategorieServiceImpl;
import fr.semifir.magasin.services.impl.ClientServiceImpl;
import fr.semifir.magasin.services.impl.ProduitServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProduitService produitService(ProduitRepository produitRepository) {
        return new ProduitServiceImpl(produitRepository);
    }

    @Bean
    public CategorieService categorieService(CategorieRepository categorieRepository) {
        return new CategorieServiceImpl(categorieRepository);
    }

    @Bean
    public ClientService clientService(ClientRepository clientRepository) {
        return new ClientServiceImpl(clientRepository);
    }

}
