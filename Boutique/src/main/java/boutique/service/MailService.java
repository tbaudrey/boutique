/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class MailService implements MailServiceInterface{
    
    public void sendMail(Utilisateur u, String msg){
        System.out.println("Mail envoyé à l'adresse email suivante: " + u.getEmail() + " avec comme contenu : " + msg);
    }

    
}
