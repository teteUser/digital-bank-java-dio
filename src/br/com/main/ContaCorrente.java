package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaCorrente extends Conta{
    private String tipo;

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
