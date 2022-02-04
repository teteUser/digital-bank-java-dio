package br.com.main;

import java.util.*;

/**
 *
 * @author teteUser
 */
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private Set<Banco> bancos = new HashSet<>();

    public Banco(String nome) {
        this.nome = nome;
        this.bancos.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> listaContas(){
        return contas;
    }
    
    public List<Conta> getContas(){
        return this.contas;
    }
    
   
}
