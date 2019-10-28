package br.com.fapan.conceitospolimorfismo;

/**
 *
 * @author lab_dev
 */
public class CervejaLager extends Cerveja{
    @Override
    public double calculaValorCervejaTipo() {       
        return super.calculaValorCervejaTipo() + 1.75;
    }
}
