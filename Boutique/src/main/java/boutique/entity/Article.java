/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 32)
    private String nom;
    private Integer stock;
    private Integer prix;
    
    @Enumerated(EnumType.STRING)
    private GenreArticle genreArticle;
    
    @ManyToOne
    @JoinColumn(name = "categorie")
    private Categorie categorie;

    @OneToMany(mappedBy = "article")
    private List<SousCommande> sousCommandes;

    public GenreArticle getGenreArticle() {
        return genreArticle;
    }

    public void setGenreArticle(GenreArticle genreArticle) {
        this.genreArticle = genreArticle;
    }

    public List<SousCommande> getSousCommandes() {
        return sousCommandes;
    }

    public void setSousCommandes(List<SousCommande> sousCommandes) {
        this.sousCommandes = sousCommandes;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<SousCommande> getSousCommande() {
        return sousCommandes;
    }

    public void setSousCommande(List<SousCommande> SousCommande) {
        this.sousCommandes = sousCommandes;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "boutique.entity.Article[ id=" + id + " ]";
    }
    
}
