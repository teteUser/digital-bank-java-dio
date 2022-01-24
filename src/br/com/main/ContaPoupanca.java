package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaPoupanca extends Conta{
    private String tipo;   

    public ContaPoupanca() {
        this.tipo = "CP";
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
