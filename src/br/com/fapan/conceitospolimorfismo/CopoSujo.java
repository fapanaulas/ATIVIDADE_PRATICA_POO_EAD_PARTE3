package br.com.fapan.conceitospolimorfismo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ademar
 */
public class CopoSujo {

    public static void main(String[] args) {
         System.out.println("GERÊNCIA DE VENDAS DE CERVEJA");
         System.out.println("########################################");
         
         Cerveja cv = new Cerveja();
         CervejaPuroMalte pm = new CervejaPuroMalte();
         CervejaLager cl = new CervejaLager();
         
        JOptionPane.showMessageDialog(null, "VALORES DAS CERVEJAS: "
                                                                         + "\n VALOR DA CERVEJA NA PROMOÇÃO R$" + cv.calculaValorCervejaTipo()
                                                                         + "\n VALOR DA CERVEJA PURO MALTE R$" + pm.calculaValorCervejaTipo()
                                                                         + "\n VALOR DA CERVEJA LAGER R$" + cl.calculaValorCervejaTipo()
        );
    }
}
