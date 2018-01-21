package br.ufrpe.geekMart.negocio;

import br.ufrpe.geekMart.classesBasicas.Administrador;
import br.ufrpe.geekMart.classesBasicas.Anuncio;
import br.ufrpe.geekMart.classesBasicas.Loja;
import br.ufrpe.geekMart.classesBasicas.Usuario;
import br.ufrpe.geekMart.dados.IRepositorioUsuario;
import br.ufrpe.geekMart.exceptions.JaExisteException;
import br.ufrpe.geekMart.exceptions.NaoExisteException;
import br.ufrpe.geekMart.exceptions.ParametroNullException;
import br.ufrpe.geekMart.negocio.*;

import java.util.List;

public class Fachada {
	
	private ControladorAnuncio cadastroAnuncio;
	private static Fachada instancia;
	private ControladorUsuario cadastroUsuario;
	private ControladorLoja cadastroLoja;
	private IRepositorioUsuario repositorioUsuario;


	private Fachada() {
		this.cadastroAnuncio = ControladorAnuncio.getInstancia();
		this.cadastroLoja = ControladorLoja.getInstancia();
		this.cadastroUsuario = ControladorUsuario.getInstancia();
		this.repositorioUsuario = repositorioUsuario;

	}

	public static Fachada getInstancia() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
    }


	    // USUARIO

		public void cadastrarUsuario  (Usuario user) throws NaoExisteException,ParametroNullException, JaExisteException {
			this.cadastroUsuario.cadastrarUsuario(user);
		}

		public Usuario buscaUsuario (String cpf) throws NaoExisteException,ParametroNullException, JaExisteException {
			return this.repositorioUsuario.buscarUsuario(cpf);
		}

		public void removerUsuario (String cpf){
			this.cadastroUsuario.removerUsuario(cpf);
		}

		//ADM

		public void admBloquearDesbloquearUsuario (String cpf) throws ParametroNullException, NaoExisteException {
		this.cadastroUsuario.admBloquearDesbloquearUsuario(cpf);
	}


		//LOGIN

		public boolean autenticarLogin(String senha, String cpf) throws ParametroNullException, NaoExisteException {
		return this.cadastroUsuario.autenticarLogin(senha,cpf);
		}

        // ANUNCIO

		public void adicionarAnuncio (Anuncio anuncio) {
			this.cadastroAnuncio.cadastrarAnuncio(anuncio);
		}

		public Anuncio buscarAnuncio (String nome) {
			return this.cadastroAnuncio.buscarAnuncio(nome);
		}


		public void removerAnuncio (String titulo) {
			this.cadastroAnuncio.removerAnuncio(titulo);
		}


		public void alterarAnuncio (Anuncio anuncio) {
			this.cadastroAnuncio.alterarAnuncio(anuncio);
		}

		public Anuncio[] getAnunciosCategoria (String categoria) {
			return this.cadastroAnuncio.getAnunciosCategoria(categoria);
		}

		public Anuncio[] getAnunciosCategoria (int categoria) {
			return this.cadastroAnuncio.getAnunciosCategoria(categoria);
		}


		// LOJA

		public void novaLoja (String cpf, Loja loja) {
			this.cadastroLoja.cadastrarLoja(cpf, loja);
		}

		public Loja buscarLoja (String nome) {
			return this.cadastroLoja.buscarLoja(nome);
		}

		public void removerLoja (String cpf) {
			this.cadastroLoja.removerLoja(cpf);
		}

		public void alterarLoja (String cpf, Loja loja) {
			this.cadastroLoja.alterarLoja(cpf, loja);
		}













	}
