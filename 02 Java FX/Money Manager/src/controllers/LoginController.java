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

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lib.Database;
import lib.MD5;
import models.User;

/**
 * FXML Controller class
 *
 * @author LUONG VU TECHNOLOGY
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void Login(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
        
        MD5 md = new MD5();
        User us = new User(username.getText(), md.md5(password.getText()));
        
        if (checkLogin(us) == 0) {
            System.out.println("Login Fail!!!");
            //((Node).getSource().getScene().getWindow().hide());
        }
        else{
            System.out.println("Welcome to....");
        }
              
    }

    private int checkLogin(User user) throws SQLException {
        Database db = new Database();
        db.DatabaseConnect();
        int log = -1;
        String sql = "SELECT * FROM tbl_user";
        db.select(sql);
        while (db.getRs().next()) {
            int empId = db.getRs().getInt(1);
            String empNo = db.getRs().getString(2);
            String empName = db.getRs().getString(3);
            if (user.getUser_password().equals(db.getRs().getString(3)) && user.getUser_name().equals(db.getRs().getString(2))) {
                //System.out.println("Welcome to....");
                log = db.getRs().getInt(5);
                break;
            } else {
                //System.out.println("Login Fail!!!");
                log = 0;
                break;
            }
        }
        return log;
    }
}