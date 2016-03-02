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
public interface MailServiceInterface {
    
    public void sendMail(Utilisateur u, String msg);
    
}
