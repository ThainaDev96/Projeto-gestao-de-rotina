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
public abstract class ABS_Pessoa {
    public abstract void incluir(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro);
    public abstract void pesquisar(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro);
    public abstract void editar(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro);
    public abstract void deletar(int id, String nome, String dataNascimento, String cpf, String email , String telefone, String dataCadastro);
}