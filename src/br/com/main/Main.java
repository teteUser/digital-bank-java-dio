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
        cc1.depositar(1350d);

        Cliente juca = new Cliente("Juca");
        Conta cc2 = new ContaPoupanca(juca, santander);
        cc2.depositar(1800d);

       cc1.imprimirExtrato();
       cc2.imprimirExtrato();

       cc1.transferir(200d, cc2);



    }
}
