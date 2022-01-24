package br.com.main;

/**
 *
 * @author teteUser
 */
public abstract class Conta implements InterfaceConta {
    private int agencia;
    private int numero;
    private double saldo;

    @Override
    public void sacar(double valor) {
        if(valor > this.getSaldo()){
            System.out.println("Não é possível sacar essa quantia. Saldo insuficiente!\n");
        }else{
            this.setSaldo(this.getSaldo() - valor);
            System.out.printf("Você sacou R$%.2f. Seu novo saldo é R$%.2f.\n", valor, this.getSaldo());
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.printf("Você depositou R$%.2f. Seu novo saldo é R$%.2f.\n", valor, this.getSaldo());
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
    }
    
    protected int getAgencia() {
        return agencia;
    }

    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    protected int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Contas{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
   
    
    
}
