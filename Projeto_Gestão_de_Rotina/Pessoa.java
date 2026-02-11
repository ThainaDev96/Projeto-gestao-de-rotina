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
public class Pessoa extends ABS_Pessoa{
    public Pessoa(){}
    public Pessoa(int id , String nome , String dataNascimento , String cpf , String email , String telefone , String dataCadastro ){
           this.id  = id; //Serve para referir-se ao atributo
           this.nome = nome;
           this.dataNascimento = dataNascimento; 
           this.cpf = cpf;
           this.email = email;
           this.telefone = telefone; 
           this.dataCadastro = dataCadastro;
          
        }
    private int id =0;
    private String nome = "";
    private String dataNascimento = "";
    private String cpf = "891.222.080-21";
    private String email = "";
    private String telefone = "";
    private String dataCadastro="";
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
            this.id = id;
    }
      public String getNome(){
        return nome;
    }
    public void setNome(String nome){
            this.nome = nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
            this.dataNascimento = dataNascimento;
    }
            
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
            this.cpf = cpf;
            
       }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
            this.email = email;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
            this.telefone = telefone;
    }
    public String getDataCadastro(){
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro){
            this.dataCadastro = dataCadastro;
            
    }   
   /*Métodos (ação)
        void incluir(){};
        void pesquisar(){};
        void editar(){};
        void deletar(){};*/
       
    public void incluir(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro) {
        
    }
    public void pesquisar(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro) {
       
    }
    public void editar(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro) {
        
    }
    public void deletar(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro) {
        
    }
     
    protected void finalize() {  }

}


    
