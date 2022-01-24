package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
    ContaCorrente cc1 = new ContaCorrente();
    cc1.setAgencia(15);
    cc1.setNumero(1150);
    
        System.out.println(cc1.toString());
    }
}
