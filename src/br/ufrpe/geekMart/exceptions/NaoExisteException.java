package br.ufrpe.geekMart.exceptions;

public class NaoExisteException extends Exception {
    private String tipo, oqNaoExiste;

    public NaoExisteException (String tipo, String oqNaoExiste) {
        super("Não existe " + tipo + " com o " + oqNaoExiste);
        this.oqNaoExiste = oqNaoExiste;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getOqNaoExiste() {
        return oqNaoExiste;
    }
}
