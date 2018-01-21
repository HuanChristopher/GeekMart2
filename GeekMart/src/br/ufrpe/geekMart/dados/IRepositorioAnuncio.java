package br.ufrpe.geekMart.dados;

import br.ufrpe.geekMart.classesBasicas.*;

public interface IRepositorioAnuncio {

    void cadastrar (Anuncio c);
    int procurarIndice (String num);
    Anuncio[] getAnunciosCategoria (String categoria);
    Anuncio[] getAnunciosCategoria (int categoria);
    Anuncio procurar (String num);
    void remover (String num);
    boolean existe (String titulo);
    void duplicaArrayAnuncios ();
    void alterarAnuncio (Anuncio anuncio);



}
