package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
        Banco santander = new Banco("Santander");
        Banco bradesco = new Banco("Bradesco");

        Cliente tete = new Cliente("Tete");
        Conta cc1 = new ContaCorrente(tete, santander);
        cc1.depositar(1350d);

        Cliente juca = new Cliente("Juca");
        Conta cc2 = new ContaPoupanca(juca, bradesco);
        cc2.depositar(1800d);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();

        cc1.transferir(200d, cc2);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();

        System.out.println("Lista de contas do Banco Santander: " + santander.getContas());
        System.out.println("Set de Bancos: " + santander.getBancos());

        /*
            Tarefas para o Tennison do futuro:

            - Não permitir instâncias de banco com o mesmo nome.

            - Ao instanciar uma nova conta, verificar qual foi o último número de conta daquele banco específico
            e incrementar o número de conta apenas no grupo daquele banco.
         */

    }
}
