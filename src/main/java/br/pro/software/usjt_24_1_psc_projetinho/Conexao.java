/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.usjt_24_1_psc_projetinho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andyc
 */
public class Conexao {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String user = "root";
    private static String password = "root"; //usjt
    private static String database = "cad_clientes";
    
    public static Connection obterConexao() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%s/%s",
                host, porta, database);
        return DriverManager.getConnection(url, user, password);
    }
}
