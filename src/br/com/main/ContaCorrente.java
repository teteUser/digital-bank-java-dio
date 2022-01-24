package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaCorrente extends Contas implements Conta {
    private String tipo;

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
