package br.ufrpe.geekMart.classesBasicas;

import java.util.ArrayList;
import java.util.Objects;

public class Loja {
	
	private Cliente cliente;
	private String nome, descricao;
	private Categorias categoria;
	private ArrayList<Anuncio> anuncios = new ArrayList<>();

	

	public Loja(){

	}

	public Loja(String nome, String descricao,Categorias categoria,Cliente cliente){
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.cliente = cliente;
		this.anuncios = anuncios;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setAnuncios(ArrayList<Anuncio> anuncios) {
		this.anuncios = anuncios;
	}


	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}


	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Anuncio> getAnuncios() {
		return anuncios;
	}

	@Override
	public String toString() {
		return "Loja{" +
				"cliente=" + cliente +
				", nome='" + nome + '\'' +
				", descricao='" + descricao + '\'' +
				", categoria=" + categoria +
				", anuncios=" + anuncios +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Loja)) return false;
		Loja loja = (Loja) o;
		return Objects.equals(getCliente(), loja.getCliente()) &&
				Objects.equals(getNome(), loja.getNome());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getCliente(), getNome());
	}
}
