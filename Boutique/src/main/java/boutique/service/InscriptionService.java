/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.Utilisateur;
import boutique.exception.ExceptionUtilisateurDejaInscrit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class InscriptionService {
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    public void insciption(Utilisateur u) throws ExceptionUtilisateurDejaInscrit{
        Iterable <Utilisateur> ListeUtil = utilisateurService.findAll();
        for (Utilisateur ut : ListeUtil)
            if (ut.getEmail().equals(u.getEmail()))
                throw new ExceptionUtilisateurDejaInscrit("Adresse e-mail déja utilisé !");
        utilisateurService.save(u);
        }
}
