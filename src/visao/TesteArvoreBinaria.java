/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ArvoreBinaria;
import modelo.Pessoa;

/**
 *
 * @author herquiloide
 */
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        Pessoa pesso1 = new Pessoa("Hele1", 5);
        Pessoa pesso2 = new Pessoa("Hele2", 2);
        Pessoa pesso3 = new Pessoa("Hele3", 3);
        Pessoa pesso4 = new Pessoa("Hele4", 1);
        Pessoa pesso5 = new Pessoa("Hele5", 7);
        Pessoa pesso6 = new Pessoa("Hele6", 6);
        Pessoa pesso7 = new Pessoa("Hele7", 8);
       
        
        arvore.adicionar(pesso1);
        arvore.adicionar(pesso2);
        arvore.adicionar(pesso3);
        arvore.adicionar(pesso4);
        arvore.adicionar(pesso5);
        arvore.adicionar(pesso6);
        arvore.adicionar(pesso7);
        
        arvore.PreOrder();
        System.out.println("\n\n\n");
        arvore.PreOrder();
    }
}
