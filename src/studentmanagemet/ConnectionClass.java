/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagemet;

/**
 *
 * @author Amol
 */

import javax.swing.*;
import java.sql.*;
public class ConnectionClass {

    Connection con;
    Statement stm;

    public ConnectionClass() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con =DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
           stm = con.createStatement();
                    

       }
       catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
           
       }
    }

    public static void main(String[] args) {

        new ConnectionClass();
    }
}
