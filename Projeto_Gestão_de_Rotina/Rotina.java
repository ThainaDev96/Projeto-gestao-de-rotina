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
public class Rotina extends ABS_Rotina {
    public Rotina(){}
    public Rotina(int idRotina , String nomeRotina ){
           this.idRotina  = idRotina; //Serve para referir-se ao atributo
           this.nomeRotina = nomeRotina;
          
        }
    
    private int idRotina =0;
    private String nomeRotina = "";
      
    public Integer getIdRotina(){
        return idRotina;
    }
    public void setIdRotina(Integer idRotina){
            this.idRotina = idRotina;
      }
    
    public String getNomeRotina(){
        return nomeRotina;
       }
    public void setNomeRotina(String nomeRotina){
            this.nomeRotina = nomeRotina;
            
}
 

   /*Métodos (ação)
    void incluir(){};
    void pesquisar(){};
    void editar(){};
    void deletar(){};*/
    
    public void incluir(int idRotina , String nomeRotina) {
        
    }
    public void pesquisar(int idRotina , String nomeRotina) {
       
    }
    public void editar(int idRotina , String nomeRotina) {
        
    }
    public void deletar(int idRotina , String nomeRotina) {
    }
    protected void finalize() {  }

}




    

