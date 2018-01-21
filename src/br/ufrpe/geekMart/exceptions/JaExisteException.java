package br.ufrpe.geekMart.exceptions;

public class JaExisteException extends Exception {
    private String tipo, oqExiste;

    public JaExisteException(String tipo, String oqExiste) {
        super("Já existe " + tipo + " com " + oqExiste);
        this.tipo = tipo;
        this.oqExiste = oqExiste;
    }

    public String getOqExiste() {
        return oqExiste;
    }

    public String getTipo() {
        return tipo;
    }
}
