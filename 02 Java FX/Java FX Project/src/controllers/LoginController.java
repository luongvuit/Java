/*
 * ---Welcome to Coder's House--- * 

 * ------------------------------ * 

 * LUONG VU  * 
 * DUY NGUYEN * 
 * HOANG ANH * 
 * PHUONG MY  * 

 * ------------------------------ * 

 * Add: 57 - 53 - Tan Phong W - D7 - HCMC  * 
 * Phone Nu: +84 0935710974 * 
 * Skype: luongvu.work@gmail.com * 
 * Email: luongvu.work@gmail.com * 

 * ------------------------------ * 

 * Copyright (C) 2019 LUONG VU TECHNOLOGY
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lib.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author LUONG VU TECHNOLOGY
 */
public class LoginController implements Initializable {

    

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane anPane;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton register;

    @FXML
    private JFXButton login;
    
    private PreparedStatement pst;
    
    Connection con;
    
    Database db = new Database();
    
    Message msg = new Message();
    public LoginController() {
        db.DatabaseConnect();
    }
 
    @FXML
    void createLogin(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {

    	
   
    	String str = "SELECT *FROM STUDENT where email=? and password=?";
    	
    	pst = con.prepareStatement(str);
    	
    	pst.setString(1, username.getText());
        pst.setString(2,password.getText());
        
        ResultSet rs = pst.executeQuery();
        int count=0;
        
        while(rs.next())
        {
        	count = count+1;
        }
    	
        if(count==1)
        {
        	
        	login.getScene().getWindow().hide();
        	
        	Stage home = new Stage();
        	Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/HomePage.fxml"));
        	home.setScene(new Scene(root));
        	home.show();
        }
        else
        {
        	msg.setMessage("Login is failed");
        }
       
    }
    
    @FXML
    public boolean checkLogin(String m_Username, String m_Password) throws SQLException {
        boolean log = false;
        String sql = "SELECT * FROM tbl_user";
        db.select(sql);
        while (db.getRs().next()) {
            int empId = db.getRs().getInt(1);
            String empNo = db.getRs().getString(2);
            String empName = db.getRs().getString(3);
            if(m_Username.equals(db.getRs().getString(2)) && m_Password.equals(db.getRs().getString(3)) ){
                System.out.println("Welcome to....");
                log = true;
                break;
            }
            else{
                
                log = false;
                break;
            }
        }
        return log;
    }
    
    

    @FXML
    void createregister(ActionEvent event) throws IOException {
    	
    	register.getScene().getWindow().hide();
    	
    	Stage signup = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/SignUP.fxml"));
    	Scene scene = new Scene(root);
    	signup.setScene(scene);
    	signup.show();

    }   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
