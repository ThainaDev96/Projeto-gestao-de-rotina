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
public class Tarefa extends ABS_Tarefa {
    public Tarefa(){}
    public Tarefa(int idTarefa , int idCategoria , String descricao , String estado ){
           this. idTarefa  =  idTarefa; //Serve para referir-se ao atributo
           this.idCategoria = idCategoria;
           this.descricao= descricao; 
           this.estado  = estado ;
              
        }
    
    private int idTarefa =0;
    private int idCategoria =0;
    private String descricao = "";
    private String estado = "";
   
    public Integer getIdTarefa(){
        return idTarefa;
    }
    public void setIdTarefa(Integer idTarefa){
        this.idTarefa = idTarefa;
            
    }   
    public Integer getIdCategoria(){
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria){
            this.idCategoria = idCategoria;
    }
        
    public String getDescricao(){
        return  descricao;
    }
    public void setDescricao(String descricao){
            this.descricao = descricao;
    }
        
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
            this. estado = estado;
    }

   /*Métodos (ação)
        void incluir(){};
        void pesquisar(){};
        void editar(){};
        void deletar(){};
        void descrever(){};*/
    
    public void incluir(int idTarefa , int idCategoria , String descricao , String estado) {
        
    }
    public void pesquisar(int idTarefa , int idCategoria , String descricao , String estado) {
       
    }
    public void editar(int idTarefa , int idCategoria , String descricao , String estado) {
        
    }
    public void deletar(int idTarefa , int idCategoria , String descricao , String estado) {
        
    }
    public void descrever(int idTarefa , int idCategoria , String descricao , String estado) {
    } 
       
   protected void finalize() {  }
   
}





    

