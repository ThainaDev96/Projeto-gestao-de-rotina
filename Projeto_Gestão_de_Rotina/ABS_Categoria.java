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
public abstract class ABS_Categoria {
    public abstract void incluir(String idCategoria , String descricao);
    public abstract void pesquisar(String idCategoria , String descricao);
    public abstract void editar(String idCategoria , String descricao);
    public abstract void deletar(String idCategoria , String descricao);
    public abstract void descrever(String idCategoria , String descricao);
}
