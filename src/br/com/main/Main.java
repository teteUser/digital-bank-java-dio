package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
        Banco santander = new Banco("Santander");
        
        Cliente tete = new Cliente("Tete");
        Conta cc1 = new ContaCorrente(tete, santander);
        
        Cliente juca = new Cliente("Juca");
        Conta cc2 = new ContaPoupanca(juca, santander);
        
       cc1.imprimirExtrato();
       cc2.imprimirExtrato();
       
    }
}
