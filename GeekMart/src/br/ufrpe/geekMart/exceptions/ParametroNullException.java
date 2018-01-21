package br.ufrpe.geekMart.exceptions;

public class ParametroNullException extends Exception {
    private String parametro;

    public ParametroNullException (String parametro) {
        super ("O parâmetro " + parametro + " não pode ser null.");
        this.parametro = parametro;
    }

    public String getParametro() {
        return parametro;
    }
}
