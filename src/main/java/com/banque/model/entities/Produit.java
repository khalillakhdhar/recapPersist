package com.banque.model.entities;

import java.util.List;

import com.banque.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Produit extends BaseEntity{
private String titre;
private String photo;
private double prix;
private String description;
private int quantite;
@ManyToOne(optional = false,fetch = FetchType.EAGER)

private Categorie categorie;

@ManyToMany(mappedBy = "produits")
List<Panier> paniers;
}
