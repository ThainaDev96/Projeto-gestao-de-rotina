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
public abstract class ABS_Rotina {
    public abstract void incluir(int idRotina , String nomeRotina);
    public abstract void pesquisar(int idRotina , String nomeRotina);
    public abstract void editar(int idRotina , String nomeRotina);
    public abstract void deletar(int idRotina , String nomeRotina);
}
  

