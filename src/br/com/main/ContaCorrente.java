package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaCorrente extends Conta{
    private String tipo;

    
    
    public ContaCorrente(int agencia, int numero) {
        this.tipo = "CC";
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setSaldo(0);
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
