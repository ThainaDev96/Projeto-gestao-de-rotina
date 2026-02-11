/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_Gestão_de_Rotina.Libi;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ThainaRibeiro
 */
public class Insert {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
 
        try {
 
            String driverName = "com.mysql.jdbc.Driver";
 
            Class.forName(driverName);
 
            // Configurando a nossa conexão com um banco de dados//
            String serverName = "204.216.145.129";    //caminho do servidor do BD
 
            String mydatabase = "progb2024";        //nome do seu banco de dados
 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";
 
            String username = "progb2024";        //nome de um usuário de seu BD      
 
            String password = "progb2024";      //sua senha de acesso
 
            Connection conn = DriverManager.getConnection(url, username, password);
 
            Statement stmt = conn.createStatement();
 
            //ResultSet rs = stmt.executeQuery( "SELECT nome FROM cliente WHERE color = 'blue'" );
            String nome      = "Thaina";
            String telefone  = "995445545";
            String endereco  = "rua A";
            String idade    ="15";
            stmt.execute("INSERT INTO lianderson_pessoa(nome,idade,cidade) VALUES('"+nome+"','"+idade+"' ,'Cidreira Beach' );"); ///preparaco da insercao do registro
            conn.close();
            System.out.println("Salvo com Sucesso");
 
        }         
           catch (SQLException e) {
               System.out.println(e.getLocalizedMessage());
           }
    }
 
        // TODO code application logic here
    }
 
    
    

