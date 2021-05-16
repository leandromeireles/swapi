package com.swapi.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "filme")
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nome;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Nave> naves;

	public Filme() {

	}

	public Filme(String nome, List<Nave> naves) {
		this.nome = nome;
		this.naves = naves;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Nave> getNaves() {
		return naves;
	}

	public void setNaves(List<Nave> naves) {
		this.naves = naves;
	}
}
