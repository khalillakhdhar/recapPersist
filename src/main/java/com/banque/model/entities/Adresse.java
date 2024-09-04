package com.banque.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
public class Adresse {
	@Id
	private long id;
	private String pays;
	private String ville;
	private String region;
	@OneToOne(cascade = CascadeType.ALL,optional = false)
	@MapsId
	@JoinColumn(name = "id")
	private Client client;

}
