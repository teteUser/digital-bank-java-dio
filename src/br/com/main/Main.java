package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
    Conta cc1 = new ContaCorrente(15, 2022);
    
    System.out.println(cc1.toString());
    cc1.depositar(1200);

    System.out.println(cc1.toString());

    cc1.sacar(1500);
        
    }
}
