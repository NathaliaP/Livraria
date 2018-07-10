package br.com.modelo.livraria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
	
	@Column
	private String nome;
	
	@Column
	private String sobrenome;
	private String biografia;
	private String capa;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAutor;
	
	@Column
	private String autorfoto;
	
	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autor(String nome, String sobrenome, String biografia, String capa, int idAutor, String autorfoto) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.biografia = biografia;
		this.capa = capa;
		this.idAutor = idAutor;
		this.autorfoto = autorfoto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getAutorfoto() {
		return autorfoto;
	}

	public void setAutorfoto(String autorfoto) {
		this.autorfoto = autorfoto;
	}
}

