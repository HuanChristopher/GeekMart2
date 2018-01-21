package br.ufrpe.geekMart.classesBasicas;

import java.util.ArrayList;

public class Cliente extends Usuario{
	
	private String telefone;
	private Endereco endereco = new Endereco();
	private ArrayList<Anuncio> anuncios = new ArrayList<>();
	private ArrayList<Loja> lojas = new ArrayList<>();
	private boolean adm = false;
	
	public Cliente(){

	}
	
	public Cliente (String nome, String cpf, String email, String telefone, Endereco endereco, String senha, boolean adm){
		super(nome,cpf,email,senha,adm);

		this.setAdm(this.adm);
		this.telefone = telefone;
		this.endereco = new Endereco(endereco.getLogradouro(), endereco.getNumero(), endereco.getBairro(), endereco.getCidade(), endereco.getEstado(), endereco.getCep(),
				endereco.getComplemento());
		this.anuncios = anuncios;
		this.lojas = lojas;
	
	}

	public void setAnuncios(ArrayList<Anuncio> anuncios) {
		this.anuncios = anuncios;
	}

	public ArrayList<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(ArrayList<Loja> lojas) {
		this.lojas = lojas;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setTelefone(String telefone){
			this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Anuncio> getAnuncios() {
		return this.anuncios;
	}

	public void setAnuncios (Anuncio anuncios) {
		this.anuncios.add(anuncios);
	}

	@Override
	public boolean isAdm() {
		return adm;
	}


}
