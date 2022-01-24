package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
        Conta cc1 = new ContaCorrente();
        Conta cc2 = new ContaCorrente();
        Conta cp1 = new ContaPoupanca();
      
        cc1.depositar(1200);

        cc1.sacar(1500);
        
        cc2.depositar(500);
             
        cc2.transferir(300, cp1);
       
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        cp1.imprimirExtrato();
        
        cc1.transferir(300, cp1);
        
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
        
    }
}
