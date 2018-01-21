package br.ufrpe.geekMart.classesBasicas;

public class Endereco {
	private String logradouro, numero, bairro, cidade, estado, cep, complemento;
	
	public Endereco(){
		
	}
	

	public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, String cep,
			String complemento) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	public String getLogradouro(){
		return logradouro;
	}

	public void setLogradouro(String logradouro){
		this.logradouro=logradouro;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		return "Logradouro: " + this.getLogradouro() + "		N�mero: " + this.getNumero() + "\nComplemento: "
				+ this.getComplemento() + "\nCep: " + this.getCep() + "\nCidade: " + this.getCidade()
				+ "		Estado: " + this.getEstado();}
	
}
