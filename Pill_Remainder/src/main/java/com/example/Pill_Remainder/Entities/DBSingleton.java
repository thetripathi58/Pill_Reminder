package com.example.Pill_Remainder.Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton implements AutoCloseable {

    private static DBSingleton instance;
    public static Connection con;
    private DBSingleton(){
        try {
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static{
        try{
            instance = new DBSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Connection getInstance(){
        return con;
    }
    @Override
    public void close(){
        try {
            this.con.close();
        }
        catch(Exception ex){
        }
    }
}