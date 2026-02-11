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
public class AppLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario = JOptionPane.showInputDialog(null,"Informe o usuario");
        String senha = JOptionPane.showInputDialog(null,"Informe sua senha");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade"));
          
        Login apelidoparalogin = new Login (usuario , senha, idade);
        //Login apelidoparalogin = new Login (30);
        
          
        
    }
}

    
    

