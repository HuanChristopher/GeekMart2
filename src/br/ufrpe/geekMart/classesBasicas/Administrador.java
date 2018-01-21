package br.ufrpe.geekMart.classesBasicas;



public class Administrador extends Usuario{
	private boolean adm = true;
	
	public Administrador(){
		
	}
	public Administrador(String nome, String cpf, String email, String senha, boolean adm) {
		super(nome, cpf, email, senha,adm);

		this.setAdm(this.adm);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCpf: " + cpf + "\nEmail: " + email;
	}

	@Override
	public boolean isAdm() {
		return adm;
	}


}
