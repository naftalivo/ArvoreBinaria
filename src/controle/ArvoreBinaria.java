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
public class ArvoreBinaria {
    
    private No raiz;
    
    /**
     * metodo publico atraves do qual introduz-se o novo objecto
     * @param pessoa 
     */
    public void adicionar(Pessoa pessoa){
        adicionar(raiz, pessoa);
    }

    
    /**
     * metodo private que adiciona um novo objecto mediante 
     * a comparacao da idades
     * @param novo
     * @param pessoa 
     */
    private void adicionar(No novo, Pessoa pessoa) {
        if(raiz == null)
            raiz = new No(pessoa);
        else{
            if(pessoa.getIdade()<novo.getPessoa().getIdade()){
                if(novo.getEsquerda() != null)
                    adicionar(novo.getEsquerda() , pessoa);
                else
                    novo.setEsquerda(new No(pessoa));
            }else{
                if(novo.getDireita() !=null)
                    adicionar(novo.getDireita(), pessoa);
                else
                    novo.setDireita(new No(pessoa));
            }
        }
            
    }
    
    
    public void PreOrder(){
        PreOrder(raiz);
    }
    
    public void InOrder(){
        InOrder(raiz);
    }
    
    public void PostOrder(){
        PostOrder(raiz);
    }
    
    private void PreOrder(No no){
        if(no != null){
            System.out.println(no.getPessoa().toString());
            PreOrder(no.getEsquerda());
            PreOrder(no.getDireita());
        }
    }
    
   private void PostOrder(No no){
       if(no != null){
           PostOrder(no.getEsquerda());
           PostOrder(no.getDireita());
           System.out.println(no.getPessoa().toString());
       }
   }
    
   public void InOrder(No no){
       if(no != null){
           InOrder(no.getEsquerda());
           System.out.println(no.getPessoa().toString());
           InOrder(no.getDireita());
       }
   }
    
   public void removerFolha(int idade){
       
   }
   
   
   
   
   /**
    * metodo que verifica o tipo de no a ser removido
    * +NO sem Filhos 
    * +NO com um filho
    * +No com dois filhos
    * @param no o no a ser removido
    * @return int que indica os 3 estados
    */
   private int verificarRemocao(No no){
       if(no.getDireita()==null && no.getEsquerda()==null)
           return 1;
       if((no.getDireita()==null && no.getEsquerda()!=null) || (no.getDireita()!=null && no.getEsquerda()==null))
           return 2;
       if(no.getDireita() != null && no.getEsquerda() != null)
           return 3;
       else return -1;
   }
   
   
   public Pessoa pesquisar(int idade){
       return pesquisarPessoa(raiz, idade).getPessoa();
   }
   
   private No pesquisarPessoa(No no, int idade){
       if(no == null)
           System.out.println("Arvore Vazia");
       else{
           if(idade == no.getPessoa().getIdade())
               return no;
           if(idade > no.getPessoa().getIdade())
              return pesquisarPessoa(no.getDireita(), idade);
           if(idade < no.getPessoa().getIdade())
              return pesquisarPessoa(no.getEsquerda(), idade);
       }
       return no;
   }
}
