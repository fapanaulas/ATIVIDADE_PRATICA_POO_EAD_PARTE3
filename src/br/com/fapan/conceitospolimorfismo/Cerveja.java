package br.com.fapan.conceitospolimorfismo;

/**
 *
 * @author ademar
 */
public class Cerveja {

    protected double valorCervejaPromomocao;

    public double calculaValorCervejaTipo() {
        this.valorCervejaPromomocao = 5.30;
        return this.valorCervejaPromomocao;
    }
}
