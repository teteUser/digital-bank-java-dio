package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaPoupanca extends Conta{
    private String tipo;   

    public ContaPoupanca(int agencia, int numero) {
        this.tipo = "CP";
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
