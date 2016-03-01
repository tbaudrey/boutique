/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.test;

import boutique.service.DBService;
import boutique.service.UtilisateurService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import boutique.spring.SpringConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class SpringTest {
    
    @PersistenceContext
    private EntityManager em;
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    @Autowired
    private DBService dBService;
    
    @Before
    public void avant(){
        dBService.supprimerTout();
    }
    
    @Test
    public void doNadaOK(){
        utilisateurService.count();
    }
    
}
