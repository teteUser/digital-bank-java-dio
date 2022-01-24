package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
    Conta cc1 = new ContaCorrente();
    cc1.setAgencia(15);
    cc1.setNumero(1150);
    cc1.depositar(1200);

    System.out.println("Saldo da conta cc1 R$" + cc1.getSaldo());
    System.out.println(cc1.toString());

    cc1.sacar(1500);
        
    }
}
