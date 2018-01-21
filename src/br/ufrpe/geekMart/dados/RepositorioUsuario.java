package br.ufrpe.geekMart.dados;

import java.util.List;

import br.ufrpe.geekMart.classesBasicas.*;
import br.ufrpe.geekMart.exceptions.NaoExisteException;
import br.ufrpe.geekMart.exceptions.ParametroNullException;

public class RepositorioUsuario implements  IRepositorioUsuario{
	
	private Usuario[] usuarios;
	private Usuario user;
	private int proxima;
	private static RepositorioUsuario instancia;

	public static RepositorioUsuario getInstancia() {
		if (instancia == null) {
			instancia = new RepositorioUsuario(100);
		}
		return instancia;
	}

	private RepositorioUsuario (int tamanho) {
		this.usuarios = new Usuario[tamanho];
		this.proxima = 0;
	}



	@Override
	public void cadastrarUsuario (Usuario c) {

		this.usuarios[this.proxima] = c;
		this.proxima = this.proxima + 1;

		if (this.proxima == this.usuarios.length) {
			this.duplicaArrayUsuarios();
            }

	}



	public Usuario buscarUsuario(String cpf) throws ParametroNullException, NaoExisteException {
		Usuario retorno = null;
		if(cpf != null){
			boolean existe = this.existeUsuario(cpf);
			if (existe) {
				int i = this.procurarIndice(cpf);
				if (i != this.proxima) {
					retorno = this.usuarios[i];
				}
				return retorno;
			} else {
				throw new NaoExisteException("usuário", "CPF " + cpf);
			}
		} else {
			throw new ParametroNullException("CPF");
		}
	}


	@Override
	public void removerUsuario (String num) {
		int i = this.procurarIndice(num);
		if (i != this.proxima){
			this.usuarios[i] = this.usuarios[this.proxima -1];
			this.usuarios[this.proxima -1]= null;
			this.proxima = this.proxima -1 ;
		} else {
			
		}
	}

	@Override
	public boolean existeUsuario (String cpf) {
		boolean existe = false;
		int indice = this.procurarIndice(cpf);
		if (indice != proxima){
			existe = true;
		}
		return existe;
	}



	@Override
	public void alterarUsuario (Usuario usuario) {
		int indice = this.procurarIndice(usuario.getCpf());
		if (indice != this.proxima) {
			usuarios[indice] = usuario;
		}
	}

	private int procurarIndice(String num){
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (num.equals(this.usuarios[i].getCpf())) {
				achou = true;
			} else {
				i++;
			}
		}
		return i;
	}




	public void duplicaArrayUsuarios () {
		if(this.usuarios != null && this.usuarios.length>0){
			Usuario[] arrayDuplicado = new Usuario[this.usuarios.length*2];
			for (int i=0; i< this.usuarios.length; i++){
				arrayDuplicado[i] = this.usuarios[i];
			}
			this.usuarios = arrayDuplicado;
		}
	}

}

