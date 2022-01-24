package br.com.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teteUser
 */
public class Banco {
    private String nome;
    public List<Conta> contas = new ArrayList();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
