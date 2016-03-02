/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.CodePromo;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class GenerationCodePromoService {
    
    @Autowired
    private CodePromoService codePromoService;
    
    public void GenerationCodePromo(CodePromo codePromo){
       
        Random rand = new Random();
        Integer nombreAleatoire = rand.nextInt(999999 - 100000 + 1) + 100000;
        codePromo.setCode(nombreAleatoire.toString());
        codePromoService.save(codePromo);
    }
}
