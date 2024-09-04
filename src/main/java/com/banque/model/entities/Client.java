package com.banque.model.entities;

import com.banque.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
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
public class Client extends BaseEntity{
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Column(unique = true,nullable = false)
	private String email;
	@Column(nullable = false)
	private String mdp;
	@Column(unique = true,nullable = false)
	private String tel;
	@OneToOne(mappedBy = "client")
	private Adresse adresse;

}
