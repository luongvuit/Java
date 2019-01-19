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
package lib;

import config.Config;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LUONG VU TECHNOLOGY
 */
public class Database {
    private Connection connection;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement statement;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void DatabaseConnect() {
        Config config = new Config();

        try {
            Class.forName(config.getConfigdriver());
            connection = DriverManager.getConnection(config.getConfigconnection(), config.getUsername(), config.getPassword());
            statement = connection.createStatement();
            System.out.println("Database Connected");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("No Connected");
        }
    }

    public void select(String sql) throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery(sql);
    }
    
    public void sqlUpdate(String sql) throws SQLException {
        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }
}