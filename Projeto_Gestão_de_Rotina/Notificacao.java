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
public class Notificacao extends ABS_Notificacao {
    public Notificacao (){}
    public Notificacao(int id, int idPessoa ,int idTarefa , String data , char enviado , char tipoEnvio ){
        this.id = id;
        this.idPessoa = idPessoa; //Serve para referir-se ao atributo
        this.idTarefa = idTarefa;
        this.data = data; 
        this.enviado = enviado;
        this.tipoEnvio = tipoEnvio; 
            
        }
    private int id = 0;
    private int idPessoa = 0;
    private int idTarefa = 0;
    private String data = "";
    private String horario = "";
    private char enviado = ' ';
    private char tipoEnvio = ' ';
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getIdPessoa(){
        return idPessoa;
    }
    public void setIdPessoa(Integer idPessoa){
            this.idPessoa = idPessoa;
    }
      public Integer getIdTarefa(){
        return idTarefa;
    }
    public void setIdTarefa(Integer idTarefa){
            this.idTarefa = idTarefa;
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
     public char getEnviado(){
        return enviado;
    }
    public void setEnviado(char enviado){
            this.enviado = enviado;
    }
      public char getTipoEnvio(){
        return  tipoEnvio;
    }
    public void setTipoEnvio(char tipoEnvio){
            this.tipoEnvio =  tipoEnvio;
    }
 
   /*Métodos (ação)
        void incluir(){};
        void pesquisar(){};
        void editar(){};
        void deletar(){};
        void enviar(){};*/



    public void incluir(int id, int idPessoa, int idTarefa, String data, String horario, char enviado, char tipoEnviado) {
        
    }
    public void pesquisar(int id, int idPessoa, int idTarefa, String data, String horario, char enviado, char tipoEnviado) {
     
    }
    public void editar(int id, int idPessoa, int idTarefa, String data, String horario, char enviado, char tipoEnviado) {
    }

    public void deletar(int id, int idPessoa, int idTarefa, String data, String horario, char enviado, char tipoEnviado) {
    }
    public void enviar(int id, int idPessoa, int idTarefa, String data, String horario, char enviado, char tipoEnviado) {
        
    }
      
    protected void finalize(){}{ //descontrutor
}

    

    
}



