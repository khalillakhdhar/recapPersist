package com.banque.model.entities;

import java.util.Set;

import com.banque.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Categorie extends BaseEntity{
	@Column(unique=true)
	private String titre;
	@OneToMany(mappedBy = "categorie")
	private Set<Produit> produits;

}
