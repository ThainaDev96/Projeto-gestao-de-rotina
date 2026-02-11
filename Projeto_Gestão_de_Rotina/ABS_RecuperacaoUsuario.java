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
public abstract class ABS_RecuperacaoUsuario {
    public abstract void incluir(int idPessoa,int idRecuperacao, String senha, String data, String horario, String codigo, String tipoEnvio);
    public abstract void pesquisar(int idPessoa,int idRecuperacao, String senha, String data,String horario, String codigo, String tipoEnvio);
    public abstract void editar(int idPessoa,int idRecuperacao, String senha, String data,String horario, String codigo, String tipoEnvio);
    public abstract void deletar(int idPessoa,int idRecuperacao, String senha, String data,String horario, String codigo, String tipoEnvio);
    public abstract void enviar(int idPessoa,int idRecuperacao, String senha, String data,String horario, String codigo, String tipoEnvio);
}