package com.swapi.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "nave")
public class Nave implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nome;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private DetalheNave detalheNave;

	public Nave() {
	}

	public Nave(String nome, DetalheNave detalheNave) {
		this.nome = nome;
		this.detalheNave = detalheNave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DetalheNave getDetalheNave() {
		return detalheNave;
	}

	public void setDetalheNave(DetalheNave detalheNave) {
		this.detalheNave = detalheNave;
	}
}
