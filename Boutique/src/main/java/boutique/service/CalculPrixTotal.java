/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.exception.ExceptionCodePromoErrone;
import boutique.entity.CodePromo;
import boutique.entity.Commande;
import boutique.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class CalculPrixTotal {
    
    @Autowired
    private CommandeService commandeService;
    
    @Autowired
    private CodePromoService codePromoService;
    
    public void CalculPrixTotal(Commande commande, CodePromo codePromo) throws ExceptionCodePromoErrone{
        
        Iterable <CodePromo> ListeCp = codePromoService.findAll();
        for(CodePromo cp : ListeCp)
            if(codePromo.getCode().equals(cp.getCode())){
                Integer prixTotal = commande.getPrixTotal();
                    if(codePromo.getTypeCodePromo().equals("POURCENTAGE")){
                        prixTotal = prixTotal * (1-(codePromo.getValeur())/100);
                    }

                    if(codePromo.getTypeCodePromo().equals("REMISE")){
                        prixTotal = prixTotal - codePromo.getValeur();
                    }
                    commande.setPrixTotal(prixTotal);
                    commandeService.save(commande);
                    
                    
//                throw new ExceptionCodePromoErrone("Code Promo Erroné");
        }
            
        
        
    }
}
