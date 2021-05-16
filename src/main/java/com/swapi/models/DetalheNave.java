package com.swapi.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalhe_nave")
public class DetalheNave implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String cor;

	private int tamanho;

	private String velocidade;

	public DetalheNave() {

	}

	public DetalheNave(String cor, int tamanho, String velocidade) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
}
