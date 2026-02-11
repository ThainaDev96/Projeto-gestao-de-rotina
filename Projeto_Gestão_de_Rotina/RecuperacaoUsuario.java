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
public class RecuperacaoUsuario extends ABS_RecuperacaoUsuario{
    public RecuperacaoUsuario(){}
    public RecuperacaoUsuario(int idPessoa,int idRecuperacao, String senha, String data,String horario, String codigo , String tipoEnvio){
           this.idPessoa  = idPessoa; //Serve para referir-se ao atributo
           this.idRecuperacao = idRecuperacao;
           this.senha= senha; 
           this.data = data;
           this.horario=horario;
           this.codigo = codigo;
           this.tipoEnvio = tipoEnvio;  
        }
    private int idPessoa =0;
    private int idRecuperacao =0;
    private String senha = "";
    private String data = "";
    private String horario = "";
    private String codigo = "";
    private String tipoEnvio = "";

    public Integer getIdPessoa(){
        return idPessoa;
    }
    public void setIdPessoa(Integer idPessoa){
        this.idPessoa = idPessoa;
            
}
    public Integer getIdRecuperacao(){
        return idRecuperacao;
    }
    public void setIdRecuperacao(Integer idRecuperacao){
        this.idRecuperacao = idRecuperacao;
            
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String Senha){
        this.senha = Senha;
            
    }   
    public String getData(){
        return data;
    }
    public void setData(String data){
            this.data = data;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
        
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
            this.codigo = codigo;
}
    public String getCodigoEnvio(){
        return tipoEnvio;
    }
    public void setCodigoEnvio(String tipoEnvio){
        this.tipoEnvio = tipoEnvio;
            
}
    
   /*Métodos (ação)
        void incluir(){};
        void pesquisar(){};
        void editar(){};
        void deletar(){};
        void enviar(){};*/
    
    public void incluir(int idPessoa,int idRecuperacao, String senha, String data, String horario ,String codigo, String tipoEnvio) {
        
    }
    public void pesquisar(int idPessoa,int idRecuperacao, String senha, String data,String horario , String codigo, String tipoEnvio) {
       
    }
    public void editar(int idPessoa,int idRecuperacao, String senha, String data, String horario ,String codigo, String tipoEnvio) {
        
    }
    public void deletar(int idPessoa,int idRecuperacao, String senha, String data, String horario ,String codigo, String tipoEnvio) {   
    }
    public void enviar(int idPessoa,int idRecuperacao, String senha, String data, String horario ,String codigo ,  String tipoEnvio) {
 
    }
    protected void finalize() {  }

    

   
    }

            


