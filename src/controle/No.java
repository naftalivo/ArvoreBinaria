/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Pessoa;

/**
 *
 * @author herquiloide
 */
public class No {
    
    private Pessoa pessoa;
    private No esquerda;
    private No Direita;

    public No() {
    }

    
    public No(Pessoa pessoa, No esquerda, No Direita) {
        this.pessoa = pessoa;
        this.esquerda = esquerda;
        this.Direita = Direita;
    }

    public No(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public No(No esquerda, No Direita) {
        this.esquerda = esquerda;
        this.Direita = Direita;
    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return Direita;
    }

    public void setDireita(No Direita) {
        this.Direita = Direita;
    }
    
    
    
}
