package br.com.modelo.livraria;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Livro {

	@Column
	private int idlivro;
	
	@Column
	private String titulo;
	
	@Column
	private Autor autor;
	
	@Column
	private Editora editora;
	
	@Column
	private Categoria categoria;
	
	@Column
	private String isbn;
	
	@Column
	private String capa;
	
	@Column
	private double preco; 
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public Livro(int idlivro, String titulo, Autor autor, Editora editora, Categoria categoria, String isbn,
			String capa, double preco) {
		super();
		this.idlivro = idlivro;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.categoria = categoria;
		this.isbn = isbn;
		this.capa = capa;
		this.preco = preco;
	}

	public int getIdlivro() {
		return idlivro;
	}

	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAutor() {
		return autor.getIdAutor();
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getEditora() {
		return editora.getIdEditora();
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getCategoria() {
		return categoria.getIdCategoria();
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
