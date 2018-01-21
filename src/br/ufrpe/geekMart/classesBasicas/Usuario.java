package br.ufrpe.geekMart.classesBasicas;

import java.util.Objects;

public abstract class  Usuario {

	protected boolean ativo,adm;
	protected String nome, email , cpf, senha;
	
	public Usuario(String nome, String email, String cpf, String senha, boolean adm){
		this.nome = nome;
		this.email=email;
		this.cpf=cpf;
		this.senha=senha;
		this.ativo =true;
		this.adm = adm;
	}
	
	public Usuario(){
	
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void setBloqueado () {
		this.ativo = false;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome; 
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getSenha(){
		return senha;
	}

	public boolean isAdm() {
		return adm;
	}

	public void setAdm(boolean adm) {
		this.adm = adm;
	}

	public boolean verificarSenha (String senha) {
		boolean r = false;
		if (this.senha.equals(senha)) {
			r = true;
		}
		return r;
	}
	
	public void setSenha(String senha){
		this.senha=senha;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Usuario)) return false;
		Usuario usuario = (Usuario) o;
		return Objects.equals(getCpf(), usuario.getCpf());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getCpf());
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"nome='" + nome + '\'' +
				", email='" + email + '\'' +
				", cpf='" + cpf + '\'' +
				'}';
	}
}
