/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_Gestão_de_Rotina;

/**
 *
 * @author ThainaRibeiro
 */
public class Categoria extends ABS_Categoria {
        public Categoria(){}//construtor default
        public Categoria(int idCategoria, String descricao){ //construtor parametrizado
            this.idCategoria = idCategoria; //Serve para referir-se ao atributo
            this.descricao = descricao;
        }
        //Atributos
       private int idCategoria =0;
       private String descricao = "";
       
       //Getters e Setters
    public Integer getIdCategoria(){
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria){
            this.idCategoria = idCategoria;
    }
       
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
            this.descricao = descricao;
    }

   /*Métodos (ação)
        void incluir(){};
        void pesquisar(){};
        void editar(){};
        void deletar(){};
        void descrever(){};*/


    public void incluir(String idCategoria, String descricao) {
        System.out.println("Categoria incluída: " + descricao);
    }
    public void pesquisar(String idCategoria, String descricao) {
       System.out.println("Categoria encontrada: " + descricao);
    }
    public void editar(String idCategoria, String descricao) {
       System.out.println("Categoria editada com sucesso: " + descricao);
    }
    public void deletar(String idCategoria, String descricao) {
        System.out.println("Categoria deletada: " + descricao);
    }
    public void descrever(String idCategoria, String descricao) {
    }   
    
    //Desconstrutor
    protected void finalize() {}
}

