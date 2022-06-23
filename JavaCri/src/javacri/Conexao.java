/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author Alunos
 */
public class Conexao {
    private  PreparedStatement Criptografar;
    
    static String url ="jdbc:mysql://localhost:3306/testeconexao";
    static String username ="root";
    static String password ="root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
     private void conectar(){
         try{
            conexao = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro C025","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro C033","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Critpografar(String senha){
        String InstrucaoSQL = ("INSERT INTO cliente VALUES ('teste',MD5('" + senha +",'chamado'));"); 
        conectar();
      try{
            st = conexao.createStatement();
            st.executeUpdate(InstrucaoSQL);
            st.close();
            conexao.close();
        }
        catch (Exception e){
        e.printStackTrace();
            
        }
      desconectar();
       
      
        
    }
} 

