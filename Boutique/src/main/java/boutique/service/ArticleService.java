/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.Article;
import boutique.entity.Categorie;
import boutique.entity.Commande;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 * 
 */
public interface ArticleService extends CrudRepository<Article, Long>{
    
    public List<Article> findByCategorie(Categorie categorie);
    
//    public List<Article> findByCategorieAnd(Categorie categorie);
    
    public List<Article> findByCategorieOrderByPrixAsc(Categorie categorie);
    
    public List<Article> findByNomOrderByPrixAsc(String nom);
    
    public List<Article> findBySousCommandesCommande(Commande commande);
    
}
