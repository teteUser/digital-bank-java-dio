package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaPoupanca extends Contas implements Conta{
    private String tipo;

    @Override
    public void sacar(double valor) {
        
    }

    @Override
    public void depositar(double valor) {
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
    }

    public ContaPoupanca() {
        this.tipo = "CP";
    }

    

    
    
    
}
