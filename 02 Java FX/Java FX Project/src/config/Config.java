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
package config;

/**
 *
 * @author LUONG VU TECHNOLOGY
 */
public class Config {
    String configdriver = "com.mysql.jdbc.Driver";
    String username = "root";
    String password = "123456a@";
    //URL
    String configconnection = "jdbc:mysql://localhost:3306/test2?autoReconnect=true&useSSL=false";

    public String getConfigdriver() {
        return configdriver;
    }

    public void setConfigdriver(String configdriver) {
        this.configdriver = configdriver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfigconnection() {
        return configconnection;
    }

    public void setConfigconnection(String configconnection) {
        this.configconnection = configconnection;
    }
}