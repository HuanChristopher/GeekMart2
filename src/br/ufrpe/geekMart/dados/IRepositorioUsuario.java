package br.ufrpe.geekMart.dados;

import br.ufrpe.geekMart.classesBasicas.*;
import br.ufrpe.geekMart.exceptions.NaoExisteException;
import br.ufrpe.geekMart.exceptions.ParametroNullException;

public interface IRepositorioUsuario {

    void cadastrarUsuario(Usuario c);
    Usuario buscarUsuario(String cpf) throws ParametroNullException, NaoExisteException;
    void removerUsuario(String num);
    boolean existeUsuario(String cpf);
    void alterarUsuario(Usuario usuario);



}
