package br.com.main;

/**
 *
 * @author teteUser
 */
public class Main {
    public static void main(String[] args){
        Banco santander = new Banco("Santander");
        Banco bradesco = new Banco("Bradesco");
        Banco santander2 = new Banco("Santander");

        Cliente tete = new Cliente("Tete");
        Conta cc1 = new ContaCorrente(tete, santander);
        cc1.depositar(1350d);
        Conta cp1 = new ContaPoupanca(tete, santander2);
        cp1.depositar(4500d);

        Cliente juca = new Cliente("Juca");
        Conta cc2 = new ContaPoupanca(juca, bradesco);
        cc2.depositar(1800d);



        cc1.imprimirExtrato();
        cc2.imprimirExtrato();

        cc1.transferir(200d, cc2);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        cp1.imprimirExtrato();




        System.out.println("Set de Bancos: " + santander.bancos);
        /*
            TO DO:
            - Não permitir instâncias de banco com o mesmo nome.

            - Ao instanciar uma nova conta, verificar qual foi o último número de conta daquele banco em específico
            e incrementar o número de conta apenas no grupo daquele banco.
         */

    }
}
