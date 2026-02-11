 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_Gestão_de_Rotina;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiro
 */
public class Login {

    public Login() {
    }//construtor default sempre!!

    public Login(String usuario, String senha, int idade) {//assinatura
        //public Login(int idade) 
        //public Login(int senha)*Conceito de assinatura: Não pode ser int o proximo, os parametros tem que estar juntos ou em ordem diferente.
        //public Login(int senha , int idade)//*correto
     

        
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Acesso Permitido!!");
        }

        if (usuario.equals("Lianderson") && senha.equals("12345") && idade >= 18) {
            JOptionPane.showMessageDialog(null, "Acesso Permitido!!");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Negado!!");
        }

    }

    protected void finalize() {
    }
}
