package com.classes.Conexao;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {

	final static String NOME_DO_BANCO = "GerenciamentoBancario";
    public static Connection conectar() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		String url = "jdbc:mysql://localhost:3307/" + NOME_DO_BANCO + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            return DriverManager.getConnection(url,"root","root");
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }
    }
}