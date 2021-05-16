package com.swapi.models;

import java.io.Serializable;

public class SwapiResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cod;

	private String message;

	public static final String STATUS_204 = "204";

	public static final String STATUS_201_SUCCESS = "201";

	public static final String STATUS_200_SUCCESS = "200";

	public static final String MSG_204_GET = "Não Existe Planetas com esse ID";

	public static final String MSG_200_GET = "Planeta consultado com sucesso";

	public static final String MSG_201_POST = "Planeta inserido com sucesso";

	public static final String MSG_201 = "201";

	public static final String MSG_ERROR = "Erro ao buscar planeta";

	public static final String MSG_ERROR_POST = "Erro ao inserir o planeta";

	public String getCod() {
		return cod;
	}

	public void setCod(String status204) {
		this.cod = status204;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
