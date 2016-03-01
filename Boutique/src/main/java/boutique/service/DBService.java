/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author admin
 */
@Service
public class DBService{
    
//    @PersistenceContext
//    private EntityManager em;
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private CategorieService categorieService;
    
    @Autowired
    private CodePromoService codePromoService;
    
    @Autowired 
    private ModeLivraisonService modeLivraisonService;
    
    @Autowired
    private CommandeService commandeService;
    
    @Autowired
    private SousCommandeService sousCommandeService;
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    
    public void supprimerTout(){
        sousCommandeService.deleteAll();
        articleService.deleteAll();
        commandeService.deleteAll();
        categorieService.deleteAll();
        utilisateurService.deleteAll();
        modeLivraisonService.deleteAll();
        codePromoService.deleteAll();
    }

}
