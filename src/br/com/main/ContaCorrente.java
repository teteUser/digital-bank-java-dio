package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaCorrente extends Contas implements Conta {
    private String tipo;

    @Override
    public void sacar() {
        
    }

    @Override
    public void depositar() {
        
    }

    @Override
    public void transferir() {
        
    }

    public ContaCorrente() {
        this.tipo = "CC";
    }

    @Override
    public String toString() {
        return "Conta{" + 
                "Tipo=" + this.tipo +
                " Agência=" + this.getAgencia() +
                " Número=" + this.getNumero() + 
                " Saldo=" + this.getSaldo() +
                "}\n";
    }


    
}
