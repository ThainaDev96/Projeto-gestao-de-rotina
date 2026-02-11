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
public abstract class ABS_Notificacao {
    public abstract void incluir(int id, int idPessoa ,int idTarefa , String data, String horario , char enviado, char tipoEnviado );
    public abstract void pesquisar(int id, int idPessoa ,int idTarefa , String data, String horario , char enviado, char tipoEnviado );
    public abstract void editar(int id, int idPessoa ,int idTarefa , String data, String horario , char enviado, char tipoEnviado );
    public abstract void deletar(int id, int idPessoa ,int idTarefa , String data, String horario , char enviado, char tipoEnviado );
    public abstract void enviar(int id, int idPessoa ,int idTarefa , String data, String horario , char enviado, char tipoEnviado );
}
