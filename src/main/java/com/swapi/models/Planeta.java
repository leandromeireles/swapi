package com.swapi.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "planeta")
public class Planeta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nome;

	private String clima;

	private String terreno;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Filme> filmes;

	public Planeta() {
	}

	public Planeta(String nome, String clima, String terreno, List<Filme> filmes) {
		this.nome = nome;
		this.clima = clima;
		this.terreno = terreno;
		this.filmes = filmes;
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

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
}
