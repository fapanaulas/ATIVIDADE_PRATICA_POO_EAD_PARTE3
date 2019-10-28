package br.com.fapan.conceitospolimorfismo;

/**
 *
 * @author lab_dev
 */
public class CervejaPuroMalte extends Cerveja{
   
    @Override
    public double calculaValorCervejaTipo() {       
        return super.calculaValorCervejaTipo() + 3.45;
    }
}
