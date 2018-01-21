package br.ufrpe.geekMart.dados;

import br.ufrpe.geekMart.classesBasicas.Loja;

public class RepositorioLoja implements IRepositorioLoja{
	
	private Loja[] lojas;
	private int proxima;	
	private static RepositorioLoja instancia;

	public static RepositorioLoja getInstancia() {
		if (instancia == null) {
			instancia = new RepositorioLoja(100);
		}
		return instancia;
	}

	private RepositorioLoja (int tamanho){
		this.lojas = new Loja[tamanho];
		this.proxima = 0;
	}
	@Override
	public void cadastrar (Loja c) {
	    boolean r = this.existe(c.getNome());
	    if (r == false) {
            this.lojas[this.proxima] = c;
            this.proxima = this.proxima +1;
            if (this.proxima == lojas.length) {
                this.duplicaArrayLojas();
            }
        }
	}
	@Override
	public Loja procurar (String num) {
		int i = this.procurarIndice(num);
		Loja resultado = null;
		if (i < this.proxima) {
			resultado = this.lojas[i];
		}
		return resultado;
	}
	@Override
	public void remover (String cpf){
		int i = this.procurarIndiceCpf(cpf);
		if (i < this.proxima){
			this.lojas[i]= this.lojas[this.proxima -1];
			this.lojas[this.proxima -1]= null;
			this.proxima = this.proxima -1;
		} else {
			
		}
	}

	private int procurarIndice (String titulo) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)){
			if (titulo.equals(this.lojas[i].getNome())) {
				achou = true;
			} else {
				i = i+1;
			}
		}
		return i;
	}
	@Override
    public boolean existe (String titulo) {
        boolean existe = false;
        int indice = this.procurarIndice(titulo);
        if (indice != this.proxima) {
            existe = true;
        }
        return existe;
    }


    private int procurarIndiceCpf (String titulo) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)){
            if (titulo.equals(this.lojas[i].getCliente().getCpf())) {
                achou = true;
            } else {
                i = i+1;
            }
        }
        return i;
    }

    public boolean existeCpf (String titulo) {
        boolean existe = false;
        int indice = this.procurarIndiceCpf(titulo);
        if (indice != this.proxima) {
            existe = true;
        }
        return existe;
    }
	@Override
	public void duplicaArrayLojas(){
		if (this.lojas != null && this.lojas.length>0) {
			Loja[] arrayDuplicado = new Loja[this.lojas.length*2];
			for(int i=0; i< this.lojas.length; i++) {
				arrayDuplicado[i] = this.lojas[i];
			}
			this.lojas = arrayDuplicado;
		}
	}
	@Override
    public void alterarLoja (String cpf, Loja loja) {
		int indice = this.procurarIndiceCpf(cpf);
		if (indice < this.proxima) {
		    lojas[indice] = loja;
        }
	}
}


