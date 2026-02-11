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
public abstract class ABS_Tarefa {
  public abstract void incluir(int idTarefa , int idCategoria , String descricao , String estado );
  public abstract void pesquisar(int idTarefa , int idCategoria , String descricao , String estado );
  public abstract void editar(int idTarefa , int idCategoria , String descricao , String estado );
  public abstract void deletar(int idTarefa , int idCategoria , String descricao , String estado );
  public abstract void descrever(int idTarefa , int idCategoria , String descricao , String estado );
}

