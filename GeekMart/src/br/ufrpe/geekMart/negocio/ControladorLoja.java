package br.ufrpe.geekMart.negocio;

import br.ufrpe.geekMart.classesBasicas.*;
import br.ufrpe.geekMart.dados.*;

public class ControladorLoja {
	private static ControladorLoja instancia;
	private IRepositorioLoja repositorio;
	
	public ControladorLoja() {
		this.repositorio = RepositorioLoja.getInstancia();
	}
	
	public void cadastrarLoja (String cpf, Loja loja){
		if(cpf != null && loja != null){
			boolean existe = this.repositorio.existeCpf(cpf);
			if (existe != true){
				this.repositorio.cadastrar(loja);
			}
		}
	}

	public Loja buscarLoja(String titulo){
		Loja retorno = null;
		if(titulo != null){
			retorno = this.repositorio.procurar(titulo);
		}
		return retorno;
	}

	public void removerLoja(String cpf){
		if(cpf != null){
			if(this.repositorio.existeCpf(cpf) != false)
				this.repositorio.remover(cpf);
		}
	}

	public void alterarLoja (String cpf, Loja loja) {
		if (cpf != null && loja != null) {
			if (this.repositorio.existeCpf(loja.getCliente().getCpf())) {
				this.repositorio.alterarLoja(cpf, loja);
			}
		}
	}

	public static ControladorLoja getInstancia() {
		if (instancia == null) {
			instancia = new ControladorLoja();
		}
		return instancia;
	}
	
	

}
