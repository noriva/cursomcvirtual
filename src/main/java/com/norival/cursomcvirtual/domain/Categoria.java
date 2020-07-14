package com.norival.cursomcvirtual.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idCategoria;
	private String nomeCategoria ;
	
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}


	public Categoria(int idCategoria, String nomeCategoria) {
	
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
	}


	public int getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	public String getNomeCategoria() {
		return nomeCategoria;
	}


	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCategoria;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (idCategoria != other.idCategoria)
			return false;
		return true;
	}
	
}
